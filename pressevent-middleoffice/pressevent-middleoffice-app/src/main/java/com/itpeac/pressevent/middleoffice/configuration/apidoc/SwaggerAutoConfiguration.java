package com.itpeac.pressevent.middleoffice.configuration.apidoc;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.ArrayList;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.servlet.DispatcherServlet;

import com.itpeac.pressevent.middleoffice.configuration.ApplicationConstants;
import com.itpeac.pressevent.middleoffice.configuration.ApplicationProperties;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@ConditionalOnWebApplication
@ConditionalOnClass({ ApiInfo.class, DispatcherServlet.class, Docket.class })
@Profile(ApplicationConstants.SPRING_PROFILE_SWAGGER)
@AutoConfigureAfter(ApplicationProperties.class)
@EnableSwagger2
public class SwaggerAutoConfiguration {
	private static final Logger LOGGER = LoggerFactory.getLogger(SwaggerAutoConfiguration.class);

	public static final String DEFAULT_INCLUDE_PATTERN = "/api/.*";

	/**
	 * Swagger Springfox configuration.
	 */
	@Bean
	public Docket swaggerSpringfoxDocket(ApplicationProperties applicationProperties) {
		LOGGER.debug("Starting Swagger");
		StopWatch watch = new StopWatch();
		watch.start();
		ApiInfo apiInfo = new ApiInfo(
				applicationProperties.getSwagger().getTitle(),
				applicationProperties.getSwagger().getDescription(), 
				applicationProperties.getSwagger().getVersion(),
				applicationProperties.getSwagger().getTermsOfServiceUrl(),
				new Contact(applicationProperties.getSwagger().getContactName(),
						applicationProperties.getSwagger().getContactUrl(),
						applicationProperties.getSwagger().getContactEmail()),
				applicationProperties.getSwagger().getLicense(), 
				applicationProperties.getSwagger().getLicenseUrl(),
				new ArrayList<VendorExtension>());

		Docket docket = new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo)
				.genericModelSubstitutes(ResponseEntity.class).forCodeGeneration(true)
				.genericModelSubstitutes(ResponseEntity.class)
				.directModelSubstitute(org.joda.time.LocalDate.class, String.class)
				.directModelSubstitute(org.joda.time.LocalDateTime.class, Date.class)
				.directModelSubstitute(org.joda.time.DateTime.class, Date.class)
				.directModelSubstitute(java.time.LocalDate.class, String.class)
				.directModelSubstitute(java.time.ZonedDateTime.class, Date.class)
				.directModelSubstitute(java.time.LocalDateTime.class, Date.class).select()
				.paths(regex(applicationProperties.getSwagger().getDefaultIncludePattern())).build();
		watch.stop();
		LOGGER.debug("Started Swagger in {} ms", watch.getTotalTimeMillis());
		return docket;
	}

}
