package com.FunctionDemos;

public class D06ReturningValueWithoutPassing {

	public static int calculateSqure() {
		int no = 5, ans;
		ans = no * no;
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = calculateSqure();
		System.out.println("Squre: " + ans);
	}

}
