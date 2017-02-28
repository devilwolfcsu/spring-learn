package com.liangwei.learnspring;

/**
 * 与MessageServiceImplB 配套使用
 * 使用工厂静态工厂方法进行实例化bean
 * Created by liangwei on 2017/2/28.
 */
public class MessagePrinterC {

    private MessageService messageService;

    private MessagePrinterC(MessageService messageService) {
        this.messageService = messageService;

    }

    public static MessagePrinterC getMessagePrint(MessageService messageService){

        return new MessagePrinterC(messageService);
    }

    public void printMessage(){

        System.out.println(this.messageService.getMessage());
    }
}
