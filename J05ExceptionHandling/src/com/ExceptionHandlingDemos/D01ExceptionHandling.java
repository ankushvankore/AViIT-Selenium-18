package com.ExceptionHandlingDemos;

public class D01ExceptionHandling {

	public static void main(String[] args) {
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat"};
		int i = 2;

		try {
			System.out.println(days[i]);
		}
		catch(NullPointerException ex) {
			System.out.println("Null Pointer Exception");
		}
		catch(ArithmeticException ex) {
			System.out.println("Arithmetic Exception");
		}
		catch(IllegalArgumentException ex) {
			System.out.println("Illeagal Argument Exception");
		}
		catch(Exception ex) {
			System.out.println(ex);
		}
		finally {	
			//Finally block get executed irrespective of exception
			System.out.println("Finally block executed!!!");
		}
		
		
		System.out.println("------------ Program Ends!!! -----------------");
	}

}
