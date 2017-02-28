package com.liangwei.learnspring;

/**
 * 与MessageServiceImplB 配套使用
 * 使用构造器实例化Bean
 * Created by liangwei on 2017/2/28.
 */
public class MessagePrinterB {

    private MessageService  messageService;

    public MessagePrinterB(MessageService messageservice){
        this.messageService = messageservice;
    }

    public void printMessage(){

        System.out.println(this.messageService.getMessage());
    }

}
