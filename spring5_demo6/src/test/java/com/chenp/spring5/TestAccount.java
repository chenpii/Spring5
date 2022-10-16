package com.chenp.spring5;

import com.chenp.spring5.config.TxConfig;
import com.chenp.spring5.entity.User;
import com.chenp.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

/**
 * @author chenpi
 * @create 2022-10-16 18:08
 */
public class TestAccount {
    @Test
    public void testAccout() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transMoney(100, "lucy", "mary");
    }

    @Test
    public void testAccout2() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.transMoney(100, "lucy", "mary");
    }

    @Test
    public void testAccout3() {

        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.transMoney(100, "lucy", "mary");
    }

    @Test
    public void testGenericApplicationContext() {
        //1 创建 GenericApplicationContext 对象
        GenericApplicationContext context = new GenericApplicationContext();
        context.refresh();
        //2.调用context的方法注册对象
        context.registerBean("user1", User.class, () -> new User());
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);
    }
}
