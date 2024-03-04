package edu.jsp.atAutowired.bean;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	public void start() {
		System.out.println("engine has started");
	}

}
