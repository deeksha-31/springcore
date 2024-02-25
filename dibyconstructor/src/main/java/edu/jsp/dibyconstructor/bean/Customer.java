package edu.jsp.dibyconstructor.bean;

public class Customer {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	private Order order;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	

	public Customer(Order order) {
		super();
		this.order = order;
	}

	public Customer(int id, String name, String email, String password, Order order) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.order = order;
	}

	public Customer() {
		super();
	}
	
	

}
