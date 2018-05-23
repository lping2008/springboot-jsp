package com.plin.domain;



public class User {
	
	private Long id;
	private String name;
	
	public User() {
		super();
	}
	
	
	public User(String name) {
		this.name = name;
	}


	public Long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
