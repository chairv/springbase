package com.tancw.event.listener;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.lang.Nullable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.tancw.bean.TopicCons;
import com.tancw.bean.User;
import com.tancw.event.RegisterEvent;
import com.tancw.mq.TopicPublic;

@Component
public class RegisterInfoListener implements SmartApplicationListener {

    @Resource
    private TopicPublic pubTopic;

    @Override
    public boolean supportsEventType(Class<? extends ApplicationEvent> aClass) {
        return aClass == RegisterEvent.class;
    }

    @Override
    public boolean supportsSourceType(@Nullable Class<?> aClass) {
        return aClass == User.class;
    }

    @Override
    @Async
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("注册事件2-发送mq:" + event.getSource());
        pubTopic.publish(TopicCons.REGISTER, JSON.toJSONString(event.getSource()));
        System.out.println("注册事件2-发送mq:结束");
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
