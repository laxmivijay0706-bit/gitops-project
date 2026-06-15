package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;

@SpringBootApplication
@RestController
public class MainApp {

    private static final Logger logger = LoggerFactory.getLogger(MainApp.class);

    public static void main(String[] args) {
        logger.info("Java backend starting...");
        SpringApplication.run(MainApp.class, args);
    }

    @GetMapping("/health")
    public Map<String, String> health() {
        logger.info("Health check requested");
        return Map.of("status", "healthy", "service", "java-backend");
    }

    @GetMapping("/api/data")
    public Map<String, String> getData() {
        logger.info("Data endpoint called");
        return Map.of("message", "Hello from Java Backend!", "version", "1.0");
    }
}
