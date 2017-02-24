package com.liangwei.learnspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *  HelloSpring 高级用法
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        MessagePrinter messagePrinter = applicationContext.getBean("messagePrinter",MessagePrinter.class);

        messagePrinter.printMessage();
    }
}
