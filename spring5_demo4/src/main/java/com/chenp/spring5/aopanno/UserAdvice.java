package com.chenp.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//增强类
@Component
@Aspect //把当前类标识为一个切面供容器读取
public class UserAdvice {

    //相同切入点抽取
    @Pointcut(value = "execution(* com.chenp.spring5.aopanno.User.add(..))")
    public void pointDemo() {

    }

    //前置通知
    @Before(value = "pointDemo()")
    public void before() {
        System.out.println("before");
    }

    //后置通知/返回通知
    @AfterReturning(value = "pointDemo()")
    public void afterReturning() {
        System.out.println("afterReturning");
    }

    //最终通知
    @After(value = "pointDemo()")
    public void after() {
        System.out.println("after");
    }

    //环绕通知
    @Around(value = "pointDemo()")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕之前");

        proceedingJoinPoint.proceed();

        System.out.println("环绕之后");
    }

    //异常通知
    @AfterThrowing(value = "pointDemo()")
    public void around() {
        System.out.println("AfterThrowing");
    }
}
