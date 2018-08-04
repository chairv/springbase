package com.tancw;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApplicationJob {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationJob.class,args);
    }
}
