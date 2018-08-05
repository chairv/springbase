package com.tancw.job;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

import com.tancw.bean.TopicCons;

@Component
public class RegisterJob {

    //    @Scheduled(cron = "0 0/1 * * * ?")
    @JmsListener(destination = TopicCons.REGISTER)
    @SendTo(TopicCons.REC_REGISTER)
    public String register(String msg) {
        System.out.println("register job begin");
        System.out.println("mq topic msg: " + msg);
        return msg;
    }
}
