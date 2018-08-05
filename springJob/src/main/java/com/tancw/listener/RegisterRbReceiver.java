package com.tancw.listener;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.tancw.bean.TopicCons;

@Component
@RabbitListener(queues = TopicCons.REGISTER)
public class RegisterRbReceiver {

    @RabbitHandler
    public void message(String msg) {
           System.out.println("rabbitmq 收到:" + msg);
    }
}
