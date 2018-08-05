package com.tancw.event.listener;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.tancw.bean.TopicCons;
import com.tancw.bean.User;
import com.tancw.event.RegisterEvent;

@Component
public class RegisterSendListener implements SmartApplicationListener {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == RegisterEvent.class;
    }

    @Override
    public boolean supportsSourceType(@Nullable Class<?> aClass) {
        return aClass == User.class;
    }

    @Override
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("注册事件rabbitmq:" + event.getSource());
        amqpTemplate.convertAndSend(TopicCons.REGISTER, JSON.toJSONString(event.getSource()));
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
