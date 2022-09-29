package com.atguigu.spring5.testdemo;

import com.atguigu.spring5.bean.Emp;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    @Test
    public void testAdd(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }
    @Test
    public void testEmp(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
