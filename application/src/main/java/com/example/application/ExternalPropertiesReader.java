package com.example.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ExternalPropertiesReader {
	
	@Value("${external.key1}") 
	private String key1;
	
	
	@Value("${external.key2}") 
	private String key2;
	{
	System.out.println("reading done");
	}


}




/*
 * import org.springframework.beans.factory.annotation.Value; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.context.annotation.PropertySource;
 * 
 * @Configuration
 * 
 * @PropertySource("classpath:external.properties") public class
 * ExternalPropertiesReader {
 * 
 * @Value("${external.key1}") private String key1;
 * 
 * @Value("${external.key2}") private String key2;
 * 
 * // Getters for key1 and key2
 * 
 * // You can add more properties and getters as needed }
 */