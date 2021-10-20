package com.comviva.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.comviva.webservice.controller"))
				.build().apiInfo(metaData());
		}
	
	private ApiInfo metaData() {
		return new ApiInfo("Sporty Shoes  RESTfull API",
				"Ecommerce Shoes RESTfull API for online store",
				"1.0.0",
				"Term of service",
				new Contact("Devansh Kapoor","http://devansh.kapoor.com/about","help@gmail.com") ,
				"Apache License Version 2.0",
				"https://www.apache.org/licenses/LICENSE-2.0.html");
	}
}
