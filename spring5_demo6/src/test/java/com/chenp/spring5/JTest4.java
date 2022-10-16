package com.chenp.spring5;

import com.chenp.spring5.service.UserService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author chenpi
 * @create 2022-10-16 22:37
 */
@RunWith(SpringJUnit4ClassRunner.class)//指定单元测试框架的版本
@ContextConfiguration("classpath:bean2.xml")//加载配置文件
public class JTest4 {
    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.transMoney(100,"lucy","mary");
    }
}
