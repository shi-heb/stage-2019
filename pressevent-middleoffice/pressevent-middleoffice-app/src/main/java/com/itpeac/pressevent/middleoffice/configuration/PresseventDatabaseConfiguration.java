package com.itpeac.pressevent.middleoffice.configuration;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.stream.Collectors;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@EnableJpaRepositories("com.itpeac.pressevent.middleoffice.repository")
public class PresseventDatabaseConfiguration {

	@Bean(name = "presseventDataSource")
	@ConfigurationProperties(prefix = "datasources.pressevent")
	public DataSource presseventDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Bean(name = "entityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
			EntityManagerFactoryBuilder entityManagerFactoryBuilder) {
		LocalContainerEntityManagerFactoryBean lcemfb = entityManagerFactoryBuilder.dataSource(presseventDataSource())
				.properties(hibernateProperties()).packages("com.itpeac.pressevent.middleoffice.domain").build();
		return lcemfb;
	}

	private Map<String, Object> hibernateProperties() {

		Resource resource = new ClassPathResource("hibernate.properties");

		try {
			Properties properties = PropertiesLoaderUtils.loadProperties(resource);
			return properties.entrySet().stream()
					.collect(Collectors.toMap(e -> e.getKey().toString(), e -> e.getValue()));
		} catch (IOException e) {
			return new HashMap<String, Object>();
		}
	}

}
