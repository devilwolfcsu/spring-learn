package com.liangwei.learnspring.domain;

import java.io.Serializable;

/**
 * Created by liangwei on 2017/4/7.
 */
public class Account implements Serializable{

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
