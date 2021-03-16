package com.ibm;

public class Manager {
	private int id;
	private String name;
	void assign(Bug bug){
		System.out.println("Bug assigned to developer");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Manager(String name, int id) {
		this.id = id;
		this.name = name;
	}

}
