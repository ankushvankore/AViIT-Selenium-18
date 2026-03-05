package com.CollectionDemos;

import java.util.HashMap;
import java.util.Map;

public class D04MapDemo {

	public static void main(String[] args) {
		/*
		 * Map<> is collection of key-value pair.
		 * Every element is having two values one is key and one is value
		 * Contact from phone, where Name is key and number will be value
		 * Key cannot be duplicate, but value can be
		 */
		Map<String, String>fileType = new HashMap<>();
		fileType.put(".txt", "Notepad");
		fileType.put(".doc", "Word");
		fileType.put(".doc", "Wordpad");
		fileType.put(".docx", "Word");
		
		for(Map.Entry<String, String> t : fileType.entrySet()) {
			System.out.println(t);
		}
		
		System.out.println(fileType);
	}

}
