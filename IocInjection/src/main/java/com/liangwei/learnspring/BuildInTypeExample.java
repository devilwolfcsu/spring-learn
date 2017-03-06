package com.liangwei.learnspring;

/**
 *
 * 内置类型注入方式演示
 * Created by liangwei on 2017/3/6.
 */
public class BuildInTypeExample {

    /* 年龄*/
    private int age;

    /* 体重 */
    private float weight;

    /* 姓名 */
    private String name;

    /* 是否已婚 */
    private boolean married;

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String toString(){
        return "age: "+ age +" weight: "+weight+" name: "+name+" isMarride: "+married;
    }
}
