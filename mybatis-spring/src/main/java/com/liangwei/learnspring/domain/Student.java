package com.liangwei.learnspring.domain;

/**
 * Created by liangwei on 2017/4/1.
 */
public class Student {

    private int id;

    private String name;

    private String gender;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString(){
        return "["+id+"，"+name+","+gender+","+age+"]";
    }
}

