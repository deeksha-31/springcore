package edu.jsp.dibysetter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibysetter.bean.User;

public class UserTest {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("userconfig.xml");
		
		User user=(User) context.getBean("myUser");
		
		System.out.println("User ID : " + user.getId());
		System.out.println("User Name : " + user.getName());
		System.out.println("User Email : " + user.getEmail());
		System.out.println("User Password : " + user.getPassword());
	}
}
