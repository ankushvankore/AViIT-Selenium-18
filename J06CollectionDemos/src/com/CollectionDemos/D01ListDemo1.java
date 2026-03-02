package com.CollectionDemos;

import java.util.ArrayList;
import java.util.List;

public class D01ListDemo1 {

	public static void main(String[] args) {
		List<String>fruits = new ArrayList<String>();
		//As List is an interface we cannot create object of List. 
		//Rather we have created object of the class ArrayList because this class implements
		//the interface List
		
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		fruits.add("Grapes");
		fruits.add("Apple");
		
		System.out.println("Total elements in the list: " + fruits.size());
		
		//System.out.println(fruits.get(0));
		//System.out.println(fruits.get(1));
		
		//for(int i = 0; i < fruits.size(); i++)
		//	System.out.println(fruits.get(i));
		
		for(String f : fruits)
			System.out.println(f);
	}

}
