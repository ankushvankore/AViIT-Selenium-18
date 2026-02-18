package com.FunctionDemos;

public class D05MultipleReturnStatements {

	public static int findMax(int n1, int n2) {
		if(n1 > n2) {
			return n1;
		}
		else {
			return n2;
		}
	}
	public static void main(String[] args) {
		int max = findMax(99, 88);
		System.out.println("Maximum: " + max);
	}

}
