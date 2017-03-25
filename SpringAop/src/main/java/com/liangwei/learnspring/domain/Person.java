package com.liangwei.learnspring.domain;

/**
 * 个人信息类
 * Created by liangwei on 2017/3/21.
 */
public abstract class Person {

    /* 全名包括姓和名 */
    private String fullName;

    /* 年龄 */
    private int  age;

    /* 性别 */
    private String gender;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
