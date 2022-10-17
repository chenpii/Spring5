package com.chenp.spring5;

import com.chenp.spring5.service.UserService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

// @ExtendWith(SpringExtension.class)
// @ContextConfiguration("classpath:bean2.xml")//加载配置文件
@SpringJUnitConfig(locations = "classpath:bean2.xml")
public class JTest5 {
    @Autowired
    private UserService userService;

    @Test
    public void test1() {
        userService.transMoney(100, "lucy", "mary");
    }
}
