package com.erligaming.dota.portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
@ComponentScan(value={"com.erligaming.dota.portal","com.erligaming.dota.Util"})
public class PortalApplication {


	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}


	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
}
