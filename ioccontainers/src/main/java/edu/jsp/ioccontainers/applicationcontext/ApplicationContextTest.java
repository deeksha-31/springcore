package edu.jsp.ioccontainers.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainers.bean.Student;

public class ApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		
		Student student=(Student) context.getBean("myStudent");
		
		student.greet();
	}

}
