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

        System.out.println("Prototype bean test:");


        UsePrototypeBeanExample1 usePrototypeBeanExample1 = applicationContext.getBean("prototypeExample1",UsePrototypeBeanExample1.class);
        System.out.println(usePrototypeBeanExample1.getPrototypeBean().getCount());

        UsePrototypeBeanExample2 usePrototypeBeanExample2 = applicationContext.getBean("prototypeExample2",UsePrototypeBeanExample2.class);
        System.out.println(usePrototypeBeanExample2.getPrototypeBean().getCount());


        UsePrototypeBeanExample3 usePrototypeBeanExample3 = applicationContext.getBean("prototypeExample3",UsePrototypeBeanExample3.class);
        System.out.println(usePrototypeBeanExample3.getPrototypeBean().getCount());

        System.out.println(applicationContext.getBean("prototypeBean",PrototypeBean.class).getCount());

        System.out.println("\n singleton bean test:");

        UseSingletonBeanExample1 useSingletonBeanExample1 = applicationContext.getBean("singletonExample1",UseSingletonBeanExample1.class);
        System.out.println(useSingletonBeanExample1.getSingletonBean().getCount());

        UseSingletonBeanExample2 useSingletonBeanExample2 = applicationContext.getBean("singletonExample2",UseSingletonBeanExample2.class);
        System.out.println(useSingletonBeanExample2.getSingletonBean().getCount());
        UseSingletonBeanExample3 useSingletonBeanExample3 = applicationContext.getBean("singletonExample3",UseSingletonBeanExample3.class);
        System.out.println(useSingletonBeanExample3.getSingletonBean().getCount());
        System.out.println(applicationContext.getBean("singletonBean",SingletonBean.class).getCount());
    }
}
