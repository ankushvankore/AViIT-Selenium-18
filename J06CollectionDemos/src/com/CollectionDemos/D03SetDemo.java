package com.CollectionDemos;

import java.util.HashSet;
import java.util.Set;

public class D03SetDemo {

	public static void main(String[] args) {
		Set<String>months = new HashSet<>();
		months.add("Jan");
		months.add("Feb");
		months.add("Mar");
		months.add("Apr");
		months.add("Feb");
		
		System.out.println("Size: " + months.size());

		for(String m : months)
			System.out.println(m);
		
		System.out.println("----------------------");
		
		Object[] m = months.toArray();
		System.out.println(m[0]);
	}

}
