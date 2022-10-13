package com.chenp.spring5;

import com.chenp.spring5.aopanno.User;
import com.chenp.spring5.aopxml.Book;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author chenpi
 * @create 2022-10-12 22:34
 */
public class AopTest {

    @Test
    public void testAopAnnotion() {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.chenp.spring5.config");
        User user = context.getBean("user", User.class);
        user.add();
    }

    @Test
    public void testAopXml() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();

    }
}
