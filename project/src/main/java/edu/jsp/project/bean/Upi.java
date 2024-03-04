package edu.jsp.project.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Upi implements Payment{

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		
		System.out.println("PAYMENT "+ "$"+amount + " DONE BY UPI");
		
	}

}
