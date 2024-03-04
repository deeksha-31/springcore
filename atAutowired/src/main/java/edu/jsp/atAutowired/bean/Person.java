package edu.jsp.atAutowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

	private Mobile mobile;

	public Mobile getMobile() {
		return mobile;
	}

	@Autowired
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}

	public void use() {
		mobile.unlock();
		System.out.println("Person is using");
	}
}
