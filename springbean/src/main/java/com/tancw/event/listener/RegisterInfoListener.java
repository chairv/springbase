package com.tancw.event.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import com.tancw.bean.User;
import com.tancw.event.RegisterEvent;

@Component
public class RegisterInfoListener implements SmartApplicationListener {

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
        System.out.println("注册事件2:" + event.getSource());
    }

    @Override
    public int getOrder() {
        return 1;
    }
}
