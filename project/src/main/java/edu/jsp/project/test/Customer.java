package edu.jsp.project.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import edu.jsp.project.bean.ShoppingCart;

@Configuration
@ComponentScan(basePackages = "edu.jsp.project")
public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(Customer.class);
		ShoppingCart cart=context.getBean(ShoppingCart.class);
		cart.checkOut(3500.0);

	}

}
