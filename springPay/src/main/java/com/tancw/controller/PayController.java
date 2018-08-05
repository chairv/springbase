package com.tancw.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tancw.bean.Payment;

@RestController
@RequestMapping("pay")
public class PayController {


    @RequestMapping("listByUser")
    public List<Payment> list(@RequestParam("id") Long userId) {
        System.out.println("pay 收到 userId:" + userId);
        List<Payment> list = new ArrayList<>();
        Payment payment = new Payment();
        payment.setAmount(new BigDecimal(100));
        payment.setCreateTime(new Date());
        payment.setId(1L);
        payment.setName("lili");
        payment.setUserId(1L);
        list.add(payment);
        return list;
    }
}
