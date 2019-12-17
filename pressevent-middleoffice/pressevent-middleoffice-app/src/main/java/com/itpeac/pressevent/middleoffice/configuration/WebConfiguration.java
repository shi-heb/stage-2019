package com.itpeac.pressevent.middleoffice.configuration;

import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import com.itpeac.pressevent.middleoffice.web.filter.CachingHttpHeadersFilter;

@Configuration
public class WebConfiguration implements ServletContextInitializer, WebServerFactoryCustomizer<WebServerFactory> {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebConfiguration.class);

	private Environment environment;
	private ApplicationProperties applicationProperties;

	@Autowired
	public WebConfiguration(Environment environment, ApplicationProperties applicationProperties) {
		this.environment = environment;
		this.applicationProperties = applicationProperties;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		if (environment.getActiveProfiles().length != 0) {
			LOGGER.info("Web application configuration, using profiles: {}",
					(Object[]) environment.getActiveProfiles());
		}

		EnumSet<DispatcherType> disps = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD,
				DispatcherType.ASYNC);

		if (environment.acceptsProfiles(Profiles.of(ApplicationConstants.SPRING_PROFILE_PRODUCTION))) {
			initCachingHttpHeadersFilter(servletContext, disps);
		}

		if (environment.acceptsProfiles(Profiles.of(ApplicationConstants.SPRING_PROFILE_DEVELOPMENT))) {
			// add dev configuration
		}

		LOGGER.info("Web application fully configured");

	}

	@Override
	public void customize(WebServerFactory factory) {

	}

	/**
	 * Initializes the caching HTTP Headers Filter.
	 */
	private void initCachingHttpHeadersFilter(ServletContext servletContext, EnumSet<DispatcherType> disps) {
		LOGGER.debug("Registering Caching HTTP Headers Filter");
		FilterRegistration.Dynamic cachingHttpHeadersFilter = servletContext.addFilter("cachingHttpHeadersFilter",
				new CachingHttpHeadersFilter(applicationProperties));

		cachingHttpHeadersFilter.addMappingForUrlPatterns(disps, true, "/i18n/*");
		cachingHttpHeadersFilter.addMappingForUrlPatterns(disps, true, "/content/*");
		cachingHttpHeadersFilter.addMappingForUrlPatterns(disps, true, "/app/*");
		cachingHttpHeadersFilter.setAsyncSupported(true);
	}

	@Bean
	public CorsFilter corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = applicationProperties.getCors();
		if (config.getAllowedOrigins() != null && !config.getAllowedOrigins().isEmpty()) {
			LOGGER.debug("Registering CORS filter");
			source.registerCorsConfiguration("/api/**", config);
			source.registerCorsConfiguration("/v2/api-docs", config);
		}
		return new CorsFilter(source);
	}
}
