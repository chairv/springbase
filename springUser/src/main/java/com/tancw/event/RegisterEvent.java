package com.tancw.event;

import org.springframework.context.ApplicationEvent;

import com.tancw.bean.User;

public class RegisterEvent extends ApplicationEvent {

    public RegisterEvent(User source) {
        super(source);
    }
}
