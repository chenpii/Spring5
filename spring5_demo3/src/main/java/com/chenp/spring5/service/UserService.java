package com.chenp.spring5.service;

import com.chenp.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author chenpi
 * @create 2022-10-08 21:55
 */
//在注解里面value属性值可以省略不写，默认值是类名称的首字母小写
//UserService -->userService
// @Component(value = "userService")// <bean id = "userService" class =".." />
@Service
public class UserService {

    //定义dao类型属性
//不需要添加set方法
//添加注入属性注解
    @Autowired//根据类型进行注入
    @Qualifier("userDaoImpl2")//根据名称进行注入
    private UserDao userDao;

    public void add() {
        userDao.add();
    }
}
