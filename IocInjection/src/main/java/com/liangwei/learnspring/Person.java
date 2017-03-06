package com.liangwei.learnspring;

/**
 * 个人信息类
 * Created by liangwei on 2017/3/6.
 */
public class Person {

    /* 年龄 */
    private  int age;

    /* 姓名 */
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  toString(){

        return "age: "+ age+"  name: "+ name;
    }
}
