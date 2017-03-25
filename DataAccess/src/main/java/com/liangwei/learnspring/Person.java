package com.liangwei.learnspring;

/**
 * Created by liangwei on 2017/3/16.
 */
public class Person {

    private int age;

    private String name;

    private Address address;


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString(){

        return "age: "+ age+" name: "+name+" address: "+address;
    }
}
