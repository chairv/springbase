package com.tancw.test;


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tancw.ApplicationUser;
import com.tancw.mq.TopicPublic;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationUser.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@EnableAutoConfiguration
public class MQTest {
    @Resource
    private TopicPublic pubTopic;

    @Test
    public void testMq() {
        pubTopic.publish("register", "lili");
        System.out.println("over");
    }
}
