package com.liangwei.leetcode;

/**
 * 为测试反射工具构造的对象
 * Created by liangwei on 2017/3/18.
 */
public class Person {

    // 姓名
    private String name;

    // 性别
    private String gender;

    // 身高 单位 CM
    private int height;

    public Person() {
    }

    public Person(String name, String gender, int height) {

        this.name = name;
        this.gender = gender;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString(){
        return "["+name+","+gender+","+height+"cm]";
    }
}
