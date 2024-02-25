package edu.jsp.dibysetter.bean;

import java.util.Map;

public class Shop {

	private int id;
	private String name;
	
	private Map<String,String> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getItems() {
		return items;
	}

	public void setItems(Map<String, String> items) {
		this.items = items;
	}

	public Shop() {
		super();
	}
	
	
}
