package com.MyTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class D07DependsOnDemo {
	@Test
	public void login() {
		System.out.println("Login test start...");
		Assert.assertTrue(false);
		System.out.println("Login test ends...");
	}

	@Test (dependsOnMethods = "login")
	public void logout() {
		System.out.println("Logout test!!!");
	}
}
