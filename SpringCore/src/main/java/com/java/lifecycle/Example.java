package com.java.lifecycle;


import java.annotation.PostConstruct;
import java.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
	
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
	
	public void start() {
		System.out.println("starting method");
	}
	
	public void end() {
		System.out.println("ending method");
		
	}
}
