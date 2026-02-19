package com.ArrayDemos;

import java.util.Arrays;

public class D02ArrayInitilization {

	public static void main(String[] args) {
		int[] marks = new int[] {65, 76, 56, 77, 87, 45};
		
		/*
		System.out.println(marks[0]);
		System.out.println(marks[1]);
		System.out.println(marks[2]);
		System.out.println(marks[3]);
		System.out.println(marks[4]);
		System.out.println(marks[5]);
		*/
		
		for(int i = 0; i < 6; i++) {
			System.out.println(marks[i]);
		}
		
		Arrays.sort(marks);
		System.out.println("---------- Array After Sorting ---------");
		
		for(int i = 0; i < 6; i++) 
			System.out.println(marks[i]);
		
	}

}
