package com.liangwei.learnspring;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.cglib.core.CollectionUtils;
import org.springframework.context.ApplicationContext;
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

        System.out.println("constructor DI example:");
        /* 构造器注入 */
        ConstructorDIExample example = applicationContext.getBean("example",ConstructorDIExample.class);

        System.out.println(example.toString());

        System.out.println("\nsetter DI example:");
        /* setter 注入 */
        SetterDIExample setterExample = applicationContext.getBean("setterExample", SetterDIExample.class);
        System.out.println(setterExample.toString());

        /* 内置类注入 */
        System.out.println("\nBuild-In Type DI example:");
        BuildInTypeExample buildInTypeExample = applicationContext.getBean("buildInTypeExample",BuildInTypeExample.class);
        System.out.println(buildInTypeExample.toString());

        /* 内部类注入*/
        System.out.println("\nInner Class  DI example:");
        InnerClassExample innerClassExample = applicationContext.getBean("innerClassExample",InnerClassExample.class);
        System.out.println(innerClassExample.toString());

        /*  容器注入 */
        System.out.println("\n Colleciton DI example:");
        CollectionDIExample collectionDIExample = applicationContext.getBean("collectionDIExample",CollectionDIExample.class);
        System.out.println(collectionDIExample.getNames().toString());
        System.out.println(collectionDIExample.getScores().toString());
        System.out.println(collectionDIExample.getClassName().toString());
        System.out.println(collectionDIExample.getClass().toString());

        /* 容器合并注入 */
        System.out.println("\n Collection Merge Di example:");
        CollectionMergeExample collectionMergeExample = applicationContext.getBean("parentCollection",CollectionMergeExample.class);
        System.out.println(collectionMergeExample.getProperties().toString());

        CollectionMergeExample childColletion = applicationContext.getBean("childCollection",CollectionMergeExample.class);
        System.out.println(childColletion.getProperties().toString());

        /* 空注入*/
        System.out.println("\n Null DI example:");
        NullExample nullExample = applicationContext.getBean("nullExample",NullExample.class);
        if(nullExample.getNullString()==null){
            System.out.println("I'm null String");
        }
        if(nullExample.getEmptyString().equals("")){
            System.out.println("I'm empty String");
        }
    }
}
