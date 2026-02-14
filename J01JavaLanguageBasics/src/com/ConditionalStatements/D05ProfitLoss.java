package com.ConditionalStatements;

import java.util.Scanner;

public class D05ProfitLoss {

	public static void main(String[] args) {
		int purchase, selling, amount;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter Purchase Amount");
		purchase = scn.nextInt();
		System.out.println("Enter selling amount");
		selling = scn.nextInt();
		
		amount = selling - purchase;
		
		if (amount == 0) {
			System.out.println("No Profit No Loss");

		}
		if (amount > 0) {
			System.out.println("Profit: " + (selling - purchase));
		} 
		else {
			System.out.println("Loss: " + (purchase - selling));
		}

	}

}
