package com.java.collection;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestCollection3 {
	public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("com/springcoreC3/Config3.xml");
        Collection3 set = (Collection3) context.getBean("set");
        
        System.out.println(set.getQuestionId());
        System.out.println(set.getQuestions());
        System.out.println(set.getAnswers());


}
}
