package com.cartoncloud.assignment.orderserviceapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


/**
 * @author naveen
 * Bean Configuration class
 */
@Configuration
public class BeanConfig {
		
	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}

}

