package com.java.collection;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCollection {

    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore2/config1.xml");
        Collection collectionmap = (Collection) context.getBean("collectionmap");
        
        System.out.println(collectionmap.getQuestionId());
        System.out.println(collectionmap.getQuestions());
        System.out.println(collectionmap.getAnswers());
        
    }
}
