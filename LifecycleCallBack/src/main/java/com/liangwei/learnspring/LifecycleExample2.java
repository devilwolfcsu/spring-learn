package com.liangwei.learnspring;

/**
 * 该类为展示全局配置方式
 * Created by liangwei on 2017/3/16.
 */
public class LifecycleExample2 {

    public void init(){
        System.out.println("LifecycleExample2 init method called!");
    }

    public void cleanup(){
        System.out.println("LifecycleExample2 cleanup method called!");
    }
}
