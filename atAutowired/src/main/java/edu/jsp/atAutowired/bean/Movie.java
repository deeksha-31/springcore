package edu.jsp.atAutowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Movie {

	private String Name;
	private Actor actor;
	
	
	public Movie(@Value("ABCD") String name,@Autowired Actor actor) {
		super();
		Name = name;
		this.actor = actor;
	}
	
	public void display() {
		System.out.println("Actor Name: "+actor.getName());
		System.out.println("Actor age: "+actor.getAge());
		System.out.println("Movie Name: "+this.Name);
	}
	
}
