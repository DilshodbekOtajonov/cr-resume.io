package com.example.resumecreatorproject;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@OpenAPIDefinition
public class ResumeCreatorProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ResumeCreatorProjectApplication.class, args);
    }

}
