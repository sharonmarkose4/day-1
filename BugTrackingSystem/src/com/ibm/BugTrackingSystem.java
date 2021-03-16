package com.ibm;

public class BugTrackingSystem {
	public static void main(String[] args) {
		
		//defect found
		Bug bug=new Bug(100,2,"HFGS",5,"A",STATUS.NEW);
		Manager manager=new Manager("Ramesh",576);
		Tester tester=new Tester("Ram",135);
		Developer developer=new Developer("Raj",234);
		manager.assign(bug);
		developer.analyse(bug);
		developer.fix(bug);
	}

}
