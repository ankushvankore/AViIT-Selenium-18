package com.Assignments;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random rnd = new Random();
		int i = rnd.nextInt(5);
		//Will generate any number randomly in the range of 0 to 4
		System.out.println(i);
		
		System.out.println("Number generated is " + i + " via random class");
	}
}
