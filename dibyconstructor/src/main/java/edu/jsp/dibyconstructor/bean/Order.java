package edu.jsp.dibyconstructor.bean;

public class Order {
	
	private int id;
	private int cost;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public Order() {
		super();
	}
	public Order(int id, int cost) {
		super();
		this.id = id;
		this.cost = cost;
	}
	
	
	

}
