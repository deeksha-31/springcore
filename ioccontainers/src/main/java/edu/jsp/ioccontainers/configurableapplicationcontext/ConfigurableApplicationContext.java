package edu.jsp.ioccontainers.configurableapplicationcontext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainers.bean.Student;

public class ConfigurableApplicationContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		org.springframework.context.ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Student student=(Student) context.getBean("myStudent");
		
		student.greet();
	}

}
