package com.ibm;
import com.A;

public class Application {
	public static void main(String[] args) {
		//B b=new B();
		//B b= (B) new A;
		A b=new B();
		System.out.println(b.age);
		b.m2();
		
	}

}
