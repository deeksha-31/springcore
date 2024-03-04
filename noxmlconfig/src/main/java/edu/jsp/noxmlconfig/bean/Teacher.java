package edu.jsp.noxmlconfig.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Teacher {
	
	private String name;	
	private String subject;
	
	
	public Teacher(@Value("Manju") String name,@Value("Java") String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	
	public void display() {
		System.out.println(" TEACHER NAME : " +this.name);
		System.out.println(" SUBJECT : " +this.subject);
	}


}
