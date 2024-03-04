package edu.jsp.atAutowired.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atAutowired.bean.AppConfig;
import edu.jsp.atAutowired.bean.Mobile;
import edu.jsp.atAutowired.bean.Person;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Person person=(Person) context.getBean("person");
		
		
		person.use();
	}

}
