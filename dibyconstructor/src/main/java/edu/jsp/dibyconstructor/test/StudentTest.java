package edu.jsp.dibyconstructor.test;

import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibyconstructor.bean.Student;



public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("studentconfig.xml");
		
		Student student1=(Student) context.getBean("student1");
		Student student2=(Student) context.getBean("student2");
		Student student3=(Student) context.getBean("student3");
		
		displayStudent(student1);
		displayStudent(student2);
		displayStudent(student3);
		
	}
		public static void displayStudent(Student student) {
			// TODO Auto-generated method stub
			System.out.println("------------------------------------");
			System.out.println("Student Id:  "+ student.getId());
			System.out.println("Student Name:  "+ student.getName());
			System.out.println("....................................");
			displaySubject(student.getSubjects());
			System.out.println("------------------------------------");
		}
	
		public static void displaySubject(List<String>subjects) {
			// TODO Auto-generated method stub
			if (subjects!=null && !subjects.isEmpty()) {
				
				System.out.println(subjects);
			} else {
				System.out.println("No subjects found");
			}
		}
		
		

	

}
