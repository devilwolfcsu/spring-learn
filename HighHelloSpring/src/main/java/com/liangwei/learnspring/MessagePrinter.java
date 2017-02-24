package com.liangwei.learnspring;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class MessagePrinter {

   private MessageService  messageService;

   public MessagePrinter(){

   }

   public void printMessage(){

       System.out.println(this.messageService.getMessage());
   }

   public void setMessageService(MessageService messageService){
       this.messageService = messageService;
   }
}
