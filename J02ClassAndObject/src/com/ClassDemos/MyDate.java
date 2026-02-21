package com.ClassDemos;

public class MyDate {
	private int day;
	private String month;
	private int year;
	
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
		System.out.println("Date is: " + day + "-" + month + "-" + year);
	}
}
