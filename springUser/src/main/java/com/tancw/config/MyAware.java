package com.tancw.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

@Component
public class MyAware implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, MessageSourceAware, ApplicationEventPublisherAware, ResourceLoaderAware {

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("获取类实例,beanFactory: ");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("获取类名:" + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {

    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        System.out.println("messageSource");
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        System.out.println("文件加载器 start");
        Resource resource = resourceLoader.getResource("application.properties");
        System.out.println(resource.getFilename());
        System.out.println("文件加载器 end");
    }
}
