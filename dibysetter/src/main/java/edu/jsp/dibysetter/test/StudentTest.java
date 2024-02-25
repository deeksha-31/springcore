package edu.jsp.dibysetter.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibysetter.bean.Student;


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");
		
		Student student=(Student) context.getBean("student");
		
		
		System.out.println("Student ID : " + student.getId());
		System.out.println("Student Name : " + student.getName());
		
		for(String string: student.getSubject()) {
			System.out.println(string);
		}
	}

}
