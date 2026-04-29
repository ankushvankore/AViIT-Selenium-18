package com.MyTests;

import org.testng.annotations.Test;

public class D06InvocationCountDemo {
  @Test (invocationCount = 5)
  public void trial() {
	  System.out.println("This is trial test case!!!");
  }
}
