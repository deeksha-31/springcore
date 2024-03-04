package edu.jsp.project.bean;

import org.springframework.stereotype.Component;

@Component
public interface Payment {
	
	public void makePayment(double amount);

}
