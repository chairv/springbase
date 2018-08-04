package com.tancw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ApplicationGateWay {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationGateWay.class, args);
    }
}
