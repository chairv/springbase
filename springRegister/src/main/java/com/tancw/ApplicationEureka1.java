package com.tancw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEureka1 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationEureka1.class, args);
    }
}
