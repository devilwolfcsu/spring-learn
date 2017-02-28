package com.liangwei.learnspring;

/**
 * 工厂Bean
 * Created by liangwei on 2017/2/28.
 */
public class MessagePrinterFactory {


    public MessagePrinterD  createMessagePrinterDInstance(MessageService messageService){

        return new MessagePrinterD(messageService);
    }
}
