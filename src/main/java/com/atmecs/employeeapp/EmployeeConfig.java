package com.atmecs.employeeapp;

import javax.management.loading.PrivateClassLoader;
import javax.sql.DataSource;

import org.hibernate.jpa.boot.spi.EntityManagerFactoryBuilder;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

@Configuration
@ConfigurationProperties(prefix = "spring.datasource")
public class EmployeeConfig {
	 private String url;

	@Bean
	public ModelMapper modelMapper() {
	
		
		System.out.println("fsdfsdjkjfndskfnsdkfndksnksdnsnjnsdfknsdkfnadksfnksdfnsd");
		
		System.out.println(url);

		return new ModelMapper();
	}

	/*
	 * @Bean(name = "datasource1")
	 * 
	 * @ConfigurationProperties(prefix = "com.db1") public DataSource datasourece()
	 * {
	 * 
	 * return DataSourceBuilder.create().build(); }
	 * 
	 * @Bean(name = "entitymanage") public LocalContainerEntityManagerFactoryBean
	 * entitymanagerFactory(EntityManagerFactoryBuilder builder,
	 * 
	 * @Qualifier("datasourc1") DataSource datasource) { return null;
	 * 
	 * }
	 */
}
