package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D02ListOfInteger {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<>();
		//Integer is wrapper class which represents the permeative data type int
		numbers.add(11);
		numbers.add(22);
		numbers.add(33);
		numbers.add(44);
		numbers.add(55);
		numbers.add(66);
		numbers.add(77);
		
		for(int n : numbers)
			System.out.println(n);
	}

}
