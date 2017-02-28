package com.liangwei.learnspring;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class MessagePrinterA {

   private MessageService  messageService;

   public MessagePrinterA(){

   }

   public void printMessage(){

       System.out.println(this.messageService.getMessage());
   }

   public void setMessageService(MessageService messageService){
       this.messageService = messageService;
   }
}
