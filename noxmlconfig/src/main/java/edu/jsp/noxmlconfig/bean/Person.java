package edu.jsp.noxmlconfig.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	
	@Value("Deeksha")
	private String name;
	@Value("22")
	private int age;
	
	
	public void display() {
		System.out.println(" PERSON NAME : " +this.name);
		System.out.println(" PERSON AGE : " +this.age);
	}

}
