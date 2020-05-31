package com.jw.first;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FirstproApplication {

	public static void main(String[] args) {
		//ApplicationContext context = new XmlBeanFactory(SpringApplication.run(FirstproApplication.class, args));
		ApplicationContext factory = new ClassPathXmlApplicationContext("spring.xml");
		Alien obj = factory.getBean(Alien.class);
		obj.code();
	}

}
