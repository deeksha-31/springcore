package edu.jsp.dibyconstructor.bean;

import java.util.List;
import java.util.Map;

public class Hotel {
	
	private int id;
	private String name;
	
	private Map<String, Double> items;

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

	public Map<String, Double> getItems() {
		return items;
	}

	public void setItems(Map<String, Double> items) {
		this.items = items;
	}

	public Hotel(int id, String name, Map<String, Double> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}

	public Hotel() {
		super();
	}

	public Hotel(Map<String, Double> items) {
		super();
		this.items = items;
	}
	
	
	

}
