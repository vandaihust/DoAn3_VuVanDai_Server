package com.vandai.doan3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.vandai.doan3.entity.Program;


@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {
	
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		HttpMethod []theUnsuportActions = {HttpMethod.PUT, HttpMethod.POST, HttpMethod.DELETE};
		//disable httpMethod product.class
		disableHttpMethod(Program.class, config, theUnsuportActions);
				
	}
	public void disableHttpMethod(Class<?> theClass, RepositoryRestConfiguration config, HttpMethod []theUnsuportActions) {
		config.getExposureConfiguration().forDomainType(theClass)
		.withItemExposure((metdata,httpMethods)->httpMethods.disable(theUnsuportActions))
		.withCollectionExposure((metdata, httpMethos)->httpMethos.disable(theUnsuportActions));
	}
}
