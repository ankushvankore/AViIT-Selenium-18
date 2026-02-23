package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;
	
	public MyDate() {
		day = 1;
		month = "Jan";
		year = 2026;
		System.out.println("Plain / Default / No Parameter Constructor Called");
	}
	
	public MyDate(int d, String m, int y) {
		day = d;
		month = m;
		year = y;
		System.out.println("Parameterized constructor called");
	}
	
	//Mutator function / setter function
	public void setDay(int d) {
		day = d;
	}
	
	//Accessor function / getter function
	public int getDay() {
		return day;
	}
	
	//Facilitator function
	public void displayDate() {
		System.out.println("Date is: " + this.day + "-" + this.month + "-" + this.year);
	}
}
