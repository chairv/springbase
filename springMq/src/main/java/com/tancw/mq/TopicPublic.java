package com.tancw.mq;

import javax.annotation.Resource;
import javax.jms.Destination;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import com.tancw.bean.TopicCons;

@Service
public class TopicPublic {

    @Resource
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void publish(String eventName, String message) {
        Destination destination = new ActiveMQTopic(eventName);
        System.out.println("=========>>>>> 发布topic消息" + message);
        jmsMessagingTemplate.convertAndSend(destination, message);
        System.out.println("=========>>>>> 发布topic消息 end," + destination + ",msg:" + message);
    }
}
