package edu.jsp.dibyconstructor.bean;

import java.util.List;

public class Student {

	private int id;
	private String name;
	
	private List<String> subjects;

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

	public List<String> getSubjects() {
		return subjects;
	}

	

	public Student(int id, String name, List<String> subjects) {
		super();
		this.id = id;
		this.name = name;
		this.subjects = subjects;
	}

	public Student() {
		super();
	}

	public Student(List<String> subjects) {
		super();
		this.subjects = subjects;
	}
	
	
}
