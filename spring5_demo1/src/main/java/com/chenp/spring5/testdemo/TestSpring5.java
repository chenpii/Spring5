package com.chenp.spring5.testdemo;

import com.chenp.spring5.Book;
import com.chenp.spring5.Orders;
import com.chenp.spring5.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author chenpi
 * @create 2022-09-28 22:03
 */
public class TestSpring5 {
    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        System.out.println(user);
        user.add();
    }

    @Test
    public void testBook1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Book book = context.getBean("book", Book.class);

        System.out.println(book);

    }

    @Test
    public void testOders1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        Orders order = context.getBean("orders", Orders.class);

        System.out.println(order);

    }

    @Test
    public void testDate() throws ParseException {
        String dateValueAPI="2022-09-29 11:36:18";
        String dateValyeDB="2022-09-29 11:36:18.0";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date dateAPI = sdf.parse(dateValueAPI);
        Date dateDB = sdf.parse(dateValyeDB);

        System.out.println(dateAPI.compareTo(dateDB));

    }
}
