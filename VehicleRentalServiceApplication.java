package com.rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@EnableJpaRepositories
public class VehicleRentalServiceApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(VehicleRentalServiceApplication.class, args);
        } catch (Throwable e) {
            System.err.println("Application failed to start due to an error:");
            e.printStackTrace();
        }
    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(ApiKeyInterceptor apiKeyInterceptor) {
        return new WebMvcConfigurer() {
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                registry.addInterceptor(apiKeyInterceptor);
            }
        };
    }
}
