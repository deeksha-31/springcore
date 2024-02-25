package edu.jsp.ioccontainers.beanfactory;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import edu.jsp.ioccontainers.bean.Student;

public class BeanFactoryTest {
	
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("config.xml");
		BeanFactory factory= new XmlBeanFactory(resource);
		
		Student student=(Student) factory.getBean("myStudent");
		Student student2=(Student) factory.getBean(Student.class);
		
		student.greet();
		student2.greet();
	}

}
