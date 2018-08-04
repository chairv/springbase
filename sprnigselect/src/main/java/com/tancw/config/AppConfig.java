package com.tancw.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tancw.bean.StudentBean;

@Configuration
public class AppConfig {
    @Bean
    public StudentBean studentBean() {
        StudentBean studentBean = new StudentBean();
        studentBean.setId(19L);
        studentBean.setName("admin");
        return studentBean;
    }
}
