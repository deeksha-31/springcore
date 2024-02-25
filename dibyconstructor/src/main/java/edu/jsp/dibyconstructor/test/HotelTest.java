package edu.jsp.dibyconstructor.test;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibyconstructor.bean.Hotel;


public class HotelTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("hotelconfig.xml");
		
		Hotel hotel1=(Hotel) context.getBean("hotel1");
		Hotel hotel2=(Hotel) context.getBean("hotel2");
		Hotel hotel3=(Hotel) context.getBean("hotel3");
		
		displayHotel(hotel1);
		displayHotel(hotel2);
		displayHotel(hotel3);
		
	}
		public static void displayHotel(Hotel hotel) {
		System.out.println("------------------------------------");
		System.out.println("Hotel Id : "+ hotel.getId());
		System.out.println("Hotel Name : "+ hotel.getName());
		
		System.out.println("....................................");
		displayItems(hotel.getItems());
		System.out.println("------------------------------------");
			
		
		}
		public static void displayItems(Map<String, Double>items) {
			
			if (items!=null && !items.isEmpty()) {
				for(Entry<String, Double> entry : items.entrySet()) {
					System.out.println(entry.getKey() + " : "+entry.getValue() );
				}

				
			} else {
				System.out.println("Items not found");

			}
			

	}

}
