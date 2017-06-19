package com.katie.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;

public class ApplicationConfiguration extends ResourceConfig{

	
	public ApplicationConfiguration(){
		
		packages("com.katie");
		
		register(RequestContextFilter.class);
		register(JacksonFeature.class);
		
		
	}
}
