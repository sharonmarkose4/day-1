package com.ibm;

public class Tester {
	private String name;
	private int id;
	void test() {
		
	}
	void assign() {
		System.out.println("Assigned bug to developer");
	}
	void verify() {
		System.out.println("verifiedr");
	}
	void close() {
		System.out.println("closed");
	}
	void retest() {
		System.out.println("retested");
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
	public Tester(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	

}
