package com.tancw.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tancw.bean.Payment;

@FeignClient(value = "user-pay",fallback = UserPayFeignFallBack.class)
public interface UserPayClient {
    @RequestMapping(value = "pay/listByUser", method = RequestMethod.GET)
    List<Payment> listByUser(@PathVariable("id") Long userId);
}
