package com.ibm;

public class Developer {
	private String name;
	private int id;
	void analyse(Bug bug) {
		System.out.println("Bug analysed");
		}
	void fix(Bug bug) {
		System.out.println("bug fixed");
		bug.setStatus(STATUS.FIXED);	
	}
   void assign() {
	   System.out.println("assigned to test for testing");
   }
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
public Developer(String name, int id) {
	super();
	this.name = name;
	this.id = id;
}
  
}
