package com.ConditionalStatements;

import java.util.Scanner;

public class D01IfDemo1 {

	public static void main(String[] args) {
		int  amount;
		double discount = 0, net;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter amount: ");
		amount = scn.nextInt();
		
		if(amount >= 1000) {
			discount = amount * 0.10;
		}
		
		net = amount - discount;
		
		System.out.println("Discount  : " + discount);
		System.out.println("Net Amount: " + net);
	}

}
