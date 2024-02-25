package edu.jsp.ioccontainers.testconfigs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.ioccontainers.bean.Teacher;

public class TeacherStudentTest {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
	
	ApplicationContext context1=new ClassPathXmlApplicationContext("config.xml");

	Teacher teacher=(Teacher) context.getBean("myTeacher");
	teacher.teach();
	//student.learn();
	}
}