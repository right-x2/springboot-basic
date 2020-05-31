package com.jw.springDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
        
        Ailen obj = (Ailen)factory.getBean("alien");
        obj.code();
        
        
        System.out.println(obj.getAge());
        //singleton
    }
}
