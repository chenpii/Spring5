package com.chenp.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author chenpi
 * @create 2022-10-12 22:51
 */
@Component
@Aspect
@Order(1)
public class PersionAdvice {

    //前置通知
    @Before(value = "execution(* com.chenp.spring5.aopanno.User.add(..))")
    public void before() {
        System.out.println("PersionAdvice:before");
    }
}
