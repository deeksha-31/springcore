package edu.jsp.dibysetter.test;

import java.util.Map;
import java.util.Map.Entry;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import edu.jsp.dibysetter.bean.Person;
import edu.jsp.dibysetter.bean.Shop;

public class TestShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("shopconfig.xml");
		
		Shop shop=(Shop) context.getBean("shop");
		
		System.out.println("Shop ID : "+shop.getId());
		System.out.println("Shop Name : "+shop.getName());
		
		Map<String, String>  items=shop.getItems();
		
		for(Entry<String, String> entry : items.entrySet()) {
			System.out.println(entry.getKey() + " : "+entry.getValue() );
		}

	}

}
