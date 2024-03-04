package edu.jsp.project.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class ShoppingCart {
	
	private final Payment payment;

	public Payment getPayment() {
		return payment;
	}

	public ShoppingCart(@Autowired  @Qualifier(value = "creditCard") Payment payment) {
		
		this.payment = payment;
	}
	
	public void checkOut(double amount) {
		
		System.out.println("CART TOTAL "+  "$"+amount);
		payment.makePayment(amount);
		
	}
	

}
