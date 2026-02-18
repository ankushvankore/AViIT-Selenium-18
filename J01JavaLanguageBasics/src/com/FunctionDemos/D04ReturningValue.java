package com.FunctionDemos;

public class D04ReturningValue {

	public static double calculateArea(int rd) {
		double area = 3.142 * rd * rd;
		return area;
	}
	
	public static void main(String[] args) {
		double ans = calculateArea(5);
		System.out.println("Area of Circle: " + ans);
	}
	
	/*
	 * Points to be noted about return statement
	 * 1. return statement terminates the function
	 * 2. You cannot write anything after return statement
	 * 3. return statement returns only single value to the calling function
	 * 4. You may have multiple return statements in the function.
	 */

}
