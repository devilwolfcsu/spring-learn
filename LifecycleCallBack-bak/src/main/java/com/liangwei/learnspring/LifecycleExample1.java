package com.liangwei.learnspring;

/**
 * 该类用于展示一个bean的初始化顺序
 * Created by liangwei on 2017/3/16.
 */
public class LifecycleExample1 {

    private int num;

    public LifecycleExample1() {
        System.out.println("LifecycleExample1 constructed!");
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println("LifecycleExample1 setNum method called!");
    }

    public void init(){
        System.out.println("LifecycleExample1 init method called!");
    }

    public void cleanup(){
        System.out.println("LifecycleExample1 cleanup method called!");
    }
}
