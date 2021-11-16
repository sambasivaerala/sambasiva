package com.java.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@Configuration
@PropertySource("classpath:app.properties")

public class Main {
public static void main(String[] args) {
		
		

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		
		
		Service s= (Service)context.getBean("service");
		
		s.Show();
		
	
		

	}

}
