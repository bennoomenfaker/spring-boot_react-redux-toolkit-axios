package com.project.products;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}

/*CorsConfig: Cette classe de configuration définit les règles CORS pour votre application. Elle permet de spécifier quelles origines (origins) sont autorisées à accéder à votre application (dans ce cas, "http://localhost:3000"),
 ainsi que les méthodes HTTP autorisées (GET, POST, PUT, DELETE).*/


