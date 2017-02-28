package com.liangwei.learnspring;

/**
 * 使用实例化的工厂方法构造
 * Created by liangwei on 2017/2/28.
 */
public class MessagePrinterD {

    MessageService messageService;


    public MessagePrinterD(MessageService messageService) {

        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(this.messageService.getMessage());
    }
}
