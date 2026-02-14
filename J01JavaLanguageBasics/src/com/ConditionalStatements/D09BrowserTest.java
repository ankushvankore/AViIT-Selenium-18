package com.ConditionalStatements;

import java.util.Scanner;

public class D09BrowserTest {

	public static void main(String[] args) {
		String browser;
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Browser: ");
		browser = scn.next();
		
		switch(browser) {
		case "Chrome":
			System.out.println("Testing the test on Chrome browser");
			break;
		case "Edge":
			System.out.println("Testing the test on Edge browser");
			break;
		case "Firefox":
			System.out.println("Testing the test on Firefox browser");
			break;
		case "Opera":
			System.out.println("Testing the test on Opera browser");
			break;
		default:
			System.out.println("Wrong browser / Browser not found");
		}
	}

}
