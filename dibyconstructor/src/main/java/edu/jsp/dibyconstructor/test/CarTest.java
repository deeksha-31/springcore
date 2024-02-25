package edu.jsp.dibyconstructor.test;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibyconstructor.bean.Car;


public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("carconfig.xml");
		
		Car car1=(Car) context.getBean("myCar");
		Car car2=(Car) context.getBean("myCar1");
		
		displayCar(car1);
		displayCar(car2);
		
	}
		public static void displayCar(Car car) {
		
			System.out.println("Car ID : " + car.getId());
			System.out.println("Car Model : " + car.getModel());
			System.out.println("Car Brand : " + car.getBrand());
		
		}

}
