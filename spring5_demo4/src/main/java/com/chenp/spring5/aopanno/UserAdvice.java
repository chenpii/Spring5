package com.chenp.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //把当前类标识为一个切面供容器读取
public class UserAdvice {

    //前置通知
    public void before() {
        System.out.println("before");
    }

}
