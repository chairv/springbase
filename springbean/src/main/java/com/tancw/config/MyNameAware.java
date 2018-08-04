package com.tancw.config;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

/**
 * 获取类名
 */
@Component
public class MyNameAware implements BeanNameAware {
    @Override
    public void setBeanName(String s) {
        System.out.println("beanNameAware:" + s);
    }
}
