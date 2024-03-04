package edu.jsp.noxmlconfig.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.noxmlconfig.bean.AppConfig;
import edu.jsp.noxmlconfig.bean.Person;
import edu.jsp.noxmlconfig.bean.Student;
import edu.jsp.noxmlconfig.bean.Teacher;

public class AppConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Person person=(Person) context.getBean("person");
		Student student=(Student) context.getBean("student");
		Teacher teacher=(Teacher) context.getBean("teacher");
		
		person.display();
		student.display();
		teacher.display();
		
		context.close();
	}

}
