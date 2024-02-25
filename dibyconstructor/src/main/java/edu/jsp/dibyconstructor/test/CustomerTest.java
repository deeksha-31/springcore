package edu.jsp.dibyconstructor.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibyconstructor.bean.Car;
import edu.jsp.dibyconstructor.bean.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("orderconfig.xml");
		
		Customer customer1=(Customer) context.getBean("myCust");
		Customer customer2=(Customer) context.getBean("myCust1");
		
		displayCustomer(customer1);
		displayCustomer(customer2);
		
	}
		public static void displayCustomer(Customer customer) {
		System.out.println("------------------------------------");
		System.out.println("Customer Id : "+ customer.getId());
		System.out.println("Customer Name : "+ customer.getName());
		System.out.println("Customer Email : "+ customer.getEmail());
		System.out.println("Customer Password : "+ customer.getPassword());
		System.out.println("....................................");
		System.out.println("Order Id: "+customer.getOrder().getId());
		System.out.println("Order Cost: "+customer.getOrder().getCost());
		System.out.println("------------------------------------");
			
		
		}
		
		

}
