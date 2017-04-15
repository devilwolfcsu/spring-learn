package com.liangwei.learnspring;

import com.liangwei.learnspring.client.AccountServiceClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml","service.xml","client.xml");

        AccountServiceClient accountServiceClient = applicationContext.getBean("accountServiceClient",AccountServiceClient.class);

        System.out.println("before invoke method");
        accountServiceClient.insertAccount(null);
        accountServiceClient.getAccounts("hello-rmi");
        System.out.println("end invoke method!");
    }
}
