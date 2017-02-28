package com.liangwei.learnspring;

/**
 * MessageService 接口的另一种实现
 * 该实现为了直接使用构造器进行初始化
 * Created by liangwei on 2017/2/28.
 */
public class MessageServiceImplB implements  MessageService{

    public String getMessage() {
        return "MessageServiceImplB: Hello ,I'm MessageService B.";
    }
}
