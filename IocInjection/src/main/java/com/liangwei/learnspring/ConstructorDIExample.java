package com.liangwei.learnspring;

/**
 * Created by liangwei on 2017/3/3.
 */
public class ConstructorDIExample {

    private String name;
    private int age;
    private Address address;

    public ConstructorDIExample(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString(){

        return name+"  "+age+"  "+address.toString();
    }
}
