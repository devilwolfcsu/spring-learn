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

        /* 使用构造器完成实例化 setter方法进行完成依赖关系 */
        MessagePrinterA messagePrinterA = applicationContext.getBean("messagePrinterA",MessagePrinterA.class);
        messagePrinterA.printMessage();

        /* 使用构造器完成实例化和依赖关系构造  */
        MessagePrinterB messagePrinterB = applicationContext.getBean("messagePrinterB",MessagePrinterB.class);
        messagePrinterB.printMessage();

        MessagePrinterB messagePrinterBB = applicationContext.getBean("messageNameBB",MessagePrinterB.class);
        messagePrinterBB.printMessage();

        MessagePrinterB messageNameB = applicationContext.getBean("messageNameB",MessagePrinterB.class);
        messageNameB.printMessage();

        /* 使用静态工厂方法完成类实例化和依赖关系注入 */
        MessagePrinterC messagePrinterC = applicationContext.getBean("messagePrinterC",MessagePrinterC.class);
        messagePrinterC.printMessage();

        /* 使用实例化工厂方法完成类构建和依赖关系注入 */
        MessagePrinterD messagePrinterD = applicationContext.getBean("messagePrinterD",MessagePrinterD.class);
        messagePrinterD.printMessage();
    }
}
