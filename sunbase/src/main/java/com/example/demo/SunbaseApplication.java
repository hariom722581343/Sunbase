package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SunbaseApplication {

    @Value("${remote.api.auth.url}")
    private String authUrl;

    public static void main(String[] args) {
        SpringApplication.run(SunbaseApplication.class, args);
    }
}
