package br.com.ws_notcake.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigDatabase {

	@Bean(name = "spring.datasource")
	@ConfigurationProperties(prefix = "spring.datasource")
	@Primary
	public DataSource primaryDataSource() {
		return DataSourceBuilder.create().build();
	}
	
}
