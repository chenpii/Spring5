package com.chenp.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author chenpi
 * @create 2022-10-08 21:55
 */
//在注解里面value属性值可以省略不写，默认值是类名称的首字母小写
//UserService -->userService
@Component(value = "userService")// <bean id = "userService" class =".." />
public class UserService {

    public void add() {
        System.out.println("UserService add......");
    }
}
