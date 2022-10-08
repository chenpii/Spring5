package com.chenp.spring5.autowire;

/**
 * @author chenpi
 * @create 2022-10-08 19:50
 */
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
