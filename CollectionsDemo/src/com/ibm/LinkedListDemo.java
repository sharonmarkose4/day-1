package com.ibm;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
public static void main(String[] args) {
	List<String> names=new LinkedList<String>();
	for (int i = 0; i < 500; i++) {
		names.add("Ram"+i);
	}
//	System.out.println(names);
	names.sort(new Comparator<String>() {
		@Override
		public int compare(String s1,String s2) {
			int value1=Integer.valueOf(s1.substring(3));
			int value2=Integer.valueOf(s2.substring(3));
			return value2-value1;
			}	
	});
	System.out.println(names);
	}
}
