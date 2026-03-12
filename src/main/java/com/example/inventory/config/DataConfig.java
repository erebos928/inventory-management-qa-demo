package com.example.inventory.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.example.inventory.repository")
public class DataConfig {
    // This class is ignored by @WebMvcTest, 
    // so the EntityManager won't be required during controller tests.
}