package com.liangwei.learnspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        //由于XmlBeanFactory已经打标废弃
        //这里使用DefaultListableBeanFactory 和 Resource

        Resource resource = new ClassPathResource("bean.xml");
        DefaultListableBeanFactory  beanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);

        MessagePrinter messagePrinter = beanFactory.getBean("messagePrinter",MessagePrinter.class);

        messagePrinter.printMessage();
    }
}
