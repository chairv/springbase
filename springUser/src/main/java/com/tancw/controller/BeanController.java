package com.tancw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tancw.bean.Payment;
import com.tancw.bean.User;
import com.tancw.event.RegisterEvent;
import com.tancw.feign.UserPayClient;

@RestController
public class BeanController extends BaseController {

    @Autowired
    private UserPayClient userPayClient;

    @RequestMapping("pay")
    public List<Payment> show() {
        Long userId = 1L;
        return userPayClient.listByUser(userId);
    }



    @RequestMapping("register")
    public String register(String name) {
        User user = new User(1L, name);
        publishEvent(new RegisterEvent(user));
        return "注册了" + name;
    }


}
