package com.ibm;

public class Bug {
	private int id;
	private int priority;
	private String projectName;
	private int location;
	private String type;
	private STATUS status;
	void newBug() {
		//logging{
	}
	public STATUS getStatus() {
		return status;
	}
	public void setStatus(STATUS status) {
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority = priority;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Bug(int id, int priority, String projectName, int location, String type, STATUS status) {
		this.id = id;
		this.priority = priority;
		this.projectName = projectName;
		this.location = location;
		this.type = type;
		this.status = status;
	}
	

}
