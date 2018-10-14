package com.erligaming.dota.portal;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import java.io.InputStream;

@SpringBootApplication
@ComponentScan(value="com.erligaming.dota.dao")
public class PortalApplication {

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		// Do any additional configuration here
		return builder.build();
	}

//	@Bean(name = "sqlSessionFactory")
//	@Primary
//	public SqlSessionFactory sqlSessionFactory() throws Exception{
//		String resource = "mybatis-config.xml";
//		InputStream inputStream = Resources.getResourceAsStream(resource);
//		return new SqlSessionFactoryBuilder().build(inputStream);
//	}


	public static void main(String[] args) {
		SpringApplication.run(PortalApplication.class, args);
	}
}
