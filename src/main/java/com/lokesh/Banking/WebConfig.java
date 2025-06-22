package com.lokesh.Banking;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration  // Marks this class as a Spring Configuration class
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        // Enable CORS for all endpoints
        registry.addMapping("/**")  // Allow all paths
                .allowedOrigins("*")  // React app running on localhost:3000
                .allowedMethods("*")  // Allow necessary HTTP methods
                .allowedHeaders("*")  ;// Allow all headers
//                .allowCredentials(true);  // Allow cookies, session, etc.
    }
}
