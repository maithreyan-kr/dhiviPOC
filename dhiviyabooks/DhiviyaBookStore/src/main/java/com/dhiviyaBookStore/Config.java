package com.dhiviyaBookStore;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
@Configuration
@EnableAutoConfiguration
public class Config 
{
	@Bean 
	  RestTemplate restTemplate()
	  { 
	    return new RestTemplate(); 
	  } 

}
