package com.ConditionalStatements;

import java.util.Scanner;

public class D03Positive_Negative {

	public static void main(String[] args) {
		//Accept a number from user and check whether the number is +ve or -ve
		int no;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter No: ");
		no = scn.nextInt();
		
		if(no > 0) {
			System.out.println("No is Positive");
		}
		else {
			System.out.println("No is Negative");
		}
			
	}

}
