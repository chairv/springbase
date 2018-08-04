package com.tancw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tancw.bean.User;
import com.tancw.event.RegisterEvent;

@RestController
public class BeanController extends BaseController {


    @RequestMapping("/")
    public String show() {
        return "hello Spring boot";
    }

    @RequestMapping("register")
    public String register(String name) {
        User user = new User(1L, name);
        publishEvent(new RegisterEvent(user));
        return "注册了" + name;
    }


}
