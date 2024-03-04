package edu.jsp.atAutowired.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {

	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	@Value("someone")
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	@Value("0")
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
