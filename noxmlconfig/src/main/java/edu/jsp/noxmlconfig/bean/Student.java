package edu.jsp.noxmlconfig.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	private String name;
	private int roll;

		public String getName() {
		return name;
	}

	@Value("Bhagya")
	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	@Value("20")
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public void display() {
		System.out.println(" STUDENT NAME : " +this.name);
		System.out.println(" ROLL NO : " +this.roll);
	}
	
}
