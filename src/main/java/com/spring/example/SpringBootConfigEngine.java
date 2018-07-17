package com.spring.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootConfigEngine {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootConfigEngine.class, args);
    }


}
