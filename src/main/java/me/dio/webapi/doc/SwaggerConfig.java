package me.dio.webapi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

	private Contact contact() {
		return new Contact()
			.name("Layin")
			.email("layon.costa@protonmail.com")
			.url("https://layinl.github.io");
	}

	@Bean
	public OpenAPI springShopOpenAPI() {
		return new OpenAPI()
			.info(new Info().title("Title - Rest API")
				.description("Springboot REST API use example")
				.version("Beta 1.0")
				.license(new License().name("Apache 2.0").url("http://springdoc.org")))
			.externalDocs(new ExternalDocumentation()
				.description("SpringShop Wiki Documentation")
				.url("https://springshop.wiki.github.org/docs"));
	}



}