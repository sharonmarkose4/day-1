package com.ibm;

public class Shape {
	private String name;
	private int sides;
	
	
	public int getSides() {
		return sides;
	}
	public void setSides(int sides) {
		this.sides = sides;
	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Shape(String name, int sides) {
		this.name = name;
		this.sides = sides;
	}
	
	

}
