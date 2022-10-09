package com.chenp.spring5.dao;

import com.chenp.spring5.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author chenpi
 * @create 2022-10-08 22:20
 */
@Repository
public class UserDaoImpl2 implements UserDao {
    @Autowired
    private User user;

    public void add() {
        System.out.println("dao2 add........");
        System.out.println(user);
    }
}
