package com.liangwei.learnspring;

/**
 * 内部类例子
 * Created by liangwei on 2017/3/6.
 */
public class InnerClassExample {

    private Person person;

    public void setPerson(Person person) {
        this.person = person;
    }

    public String toString(){
        return person.toString();
    }
}
