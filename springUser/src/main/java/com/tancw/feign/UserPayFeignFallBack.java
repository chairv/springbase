package com.tancw.feign;

import java.util.List;

import org.springframework.stereotype.Component;

import com.tancw.bean.Payment;

@Component
public class UserPayFeignFallBack implements UserPayClient {
    @Override
    public List<Payment> listByUser(Long userId) {
        System.out.println("查询失败了");
        return null;
    }
}
