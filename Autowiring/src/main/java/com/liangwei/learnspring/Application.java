package com.liangwei.learnspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.util.StringUtils;

import java.util.Set;

/**
 *
 * Created by liangwei on 2017/2/15.
 */
public class Application {

    public static void main(String[] args){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");

        Person person = applicationContext.getBean("person",Person.class);
        System.out.println(person.toString());
    }
}
