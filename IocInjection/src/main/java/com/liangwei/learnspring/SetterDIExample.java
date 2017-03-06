package com.liangwei.learnspring;

/**
 * setter注入例子
 * Created by liangwei on 2017/3/3.
 */
public class SetterDIExample {

    private int age;

    private String  name;

    private Address address;

    public SetterDIExample() {

    }

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

        return name+"  "+age+"  "+address.toString();
    }
}
