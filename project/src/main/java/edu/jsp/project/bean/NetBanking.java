package edu.jsp.project.bean;

import org.springframework.stereotype.Component;

@Component
public class NetBanking implements Payment{

	@Override
	public void makePayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("PAYMENT "+ "$"+amount + " DONE BY NETBANKING");

		
	}

}
