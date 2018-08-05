package com.tancw.config;


import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tancw.bean.TopicCons;

@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue() {
        return new Queue(TopicCons.REGISTER);
    }
}
