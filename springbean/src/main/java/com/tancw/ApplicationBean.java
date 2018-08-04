package com.tancw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ApplicationBean {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationBean.class, args);
    }
}
