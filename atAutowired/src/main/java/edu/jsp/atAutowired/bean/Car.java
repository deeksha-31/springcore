package edu.jsp.atAutowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	
	@Autowired
	private Engine engine;
	
	public void run() {
		engine.start();
		System.out.println("Car is moving");
		
	}

}
