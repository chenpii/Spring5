package com.chenp.spring5;

import com.chenp.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

import java.lang.management.PlatformLoggingMXBean;

/**
 * @author chenpi
 * @create 2022-10-16 18:08
 */
public class TestAccount {
    @Test
    public void testAccout() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transMoney(100,"lucy","mary");
    }
}
