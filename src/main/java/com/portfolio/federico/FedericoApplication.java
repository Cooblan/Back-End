package com.portfolio.federico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class FedericoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FedericoApplication.class, args);
	}

        @Bean
        public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://frontendpruebafs.web.app").allowedMethods("*").allowedHeaders("*");
			}
		};
	}
}
