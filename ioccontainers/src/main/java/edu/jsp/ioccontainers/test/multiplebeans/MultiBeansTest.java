package edu.jsp.ioccontainers.test.multiplebeans;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainers.bean.Student;
import edu.jsp.ioccontainers.bean.Teacher;

public class MultiBeansTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("config2.xml");
		
		Student student1=(Student)context.getBean("myStudent");

		Student student2=(Student)context.getBean("myStudent1");

		Teacher teacher=(Teacher)context.getBean("myTeacher");

		Teacher teacher1=(Teacher)context.getBean("myTeacher1");
		
		student1.greet();
		teacher.teach();
		student1.learn();
		
		student2.greet();
		teacher1.teach();
		student2.learn();
	}

}
