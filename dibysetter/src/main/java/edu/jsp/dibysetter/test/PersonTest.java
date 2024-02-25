package edu.jsp.dibysetter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibysetter.bean.Mobile;
import edu.jsp.dibysetter.bean.Person;
import edu.jsp.dibysetter.bean.User;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("personconfig.xml");
		
		Person person=(Person) context.getBean("person");
		Mobile mobile=person.getMobile();
		
		System.out.println("Person ID : " + person.getId());
		System.out.println("Person Name : " + person.getName());
		
		System.out.println("----------------------------------------");
		System.out.println("Mobile ID : " +mobile.getId());
		System.out.println("Brand : " + mobile.getBrand());
		System.out.println("Model : " + mobile.getModel());
	}

}
