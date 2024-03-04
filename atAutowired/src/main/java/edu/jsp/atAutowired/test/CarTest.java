package edu.jsp.atAutowired.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import edu.jsp.atAutowired.bean.AppConfig;
import edu.jsp.atAutowired.bean.Car;
import edu.jsp.atAutowired.bean.Engine;



public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		Engine engine=(Engine) context.getBean("engine");
		Car car=(Car) context.getBean("car");
		
		
		car.run();
	}

}
