package edu.jsp.dibyconstructor.bean;

public class Car {
	
	private int id;
	private String model;
	private String brand;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Car(int id, String model, String brand) {
		super();
		this.id = id;
		this.model = model;
		this.brand = brand;
	}
	public Car() {
		super();
	}
	public Car(int id) {
		super();
		this.id = id;
	}
	


}
