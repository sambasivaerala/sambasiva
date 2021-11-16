package com.java.bean;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
 
public class Person implements DisposableBean, InitializingBean {

    private String name;
 
    Person() {
        System.out.println("Constructor of person bean is invoked!");
    }
 
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
 
    //Bean initialization code
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing method of person bean is invoked!");
    }
 
    //Bean destruction code
    public void destroy() throws Exception {
        System.out.println("Destroy method of person bean is invoked!");
    }
}
