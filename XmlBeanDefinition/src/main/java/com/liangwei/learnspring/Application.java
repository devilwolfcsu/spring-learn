package com.liangwei.learnspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        /** 使用setter方法进行完成依赖关系 */
        MessagePrinterA messagePrinterA = applicationContext.getBean("messagePrinterA",MessagePrinterA.class);
        messagePrinterA.printMessage();

        MessagePrinterB messagePrinterB = applicationContext.getBean("messagePrinterB",MessagePrinterB.class);
        messagePrinterB.printMessage();

        MessagePrinterC messagePrinterC = applicationContext.getBean("messagePrinterC",MessagePrinterC.class);
        messagePrinterC.printMessage();

        MessagePrinterD messagePrinterD = applicationContext.getBean("messagePrinterD",MessagePrinterD.class);
        messagePrinterD.printMessage();
    }
}
