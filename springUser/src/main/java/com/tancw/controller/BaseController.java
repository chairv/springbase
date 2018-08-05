package com.tancw.controller;

import javax.annotation.Resource;

import org.springframework.context.ApplicationEvent;

import com.tancw.event.SpringEvent;

public class BaseController {

    @Resource
    private SpringEvent springEvent;

    public void publishEvent(ApplicationEvent event) {
        springEvent.publishEvent(event);
    }
}
