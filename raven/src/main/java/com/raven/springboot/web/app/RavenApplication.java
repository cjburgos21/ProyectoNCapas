package com.raven.springboot.web.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.raven.springboot.web.app.RavenApplication;

@SpringBootApplication
public class RavenApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(RavenApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(RavenApplication.class);
	}

}
