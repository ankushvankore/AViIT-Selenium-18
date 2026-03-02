package com.ExceptionHandlingDemos;

public class D03ExceptionPropagation {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main method starts");
		
		trialMethod();
		
		System.out.println("Main method ends");
	}
	
	public static void trialMethod() throws InterruptedException {
		System.out.println("Trial method starts");
		
		Thread.sleep(5000);
		
		System.out.println("Trial method ends");
	}

}
