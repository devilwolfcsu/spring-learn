package com.liangwei.learnspring;

import com.liangwei.learnspring.dao.StudentDAO;
import com.liangwei.learnspring.dao.StudentDAOSupport;
import com.liangwei.learnspring.dao.StudentMapper;
import com.liangwei.learnspring.domain.Student;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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

    private static final Logger logger = LogManager.getLogger(Application.class);

    public static void main(String[] args){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("dao.xml");


        logger.info("Hello, Log4j2!");
    }
}
