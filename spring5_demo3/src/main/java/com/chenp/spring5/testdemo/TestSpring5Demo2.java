package com.chenp.spring5.testdemo;

import com.chenp.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenpi
 * @create 2022-10-08 21:00
 */
public class TestSpring5Demo2 {

    @Test
    public void test(){
       ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
}
