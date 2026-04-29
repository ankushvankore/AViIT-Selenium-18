package com.MyTests;

import org.testng.annotations.Test;

public class D08InvocationTimeout {
	@Test(invocationTimeOut = 3000)
	public void demoTest() throws InterruptedException {
		System.out.println("Test start!!!");
		
		Thread.sleep(3500);
		
		System.out.println("Test ends!!!");
	}
}
