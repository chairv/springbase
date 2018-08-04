package com.tancw.mq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Service;

import com.tancw.bean.TopicCons;

@Service
public class TopicLisenters {

    @JmsListener(destination = TopicCons.REGISTER)
    @SendTo("rec.register")
    public String subscribe(String text) {
        System.out.println("====>>收到订阅消息:" + text);
        return text;
    }
}
