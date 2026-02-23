package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDay(21);
		int d = d1.getDay();
		System.out.println("Day: " + d);
		d1.displayDate();
		
		System.out.println("-------------------------------");
		
		MyDate d2 = new MyDate();
		d2.displayDate();
		
		System.out.println("--------------------------------");
		
		MyDate d3 = new MyDate();
		d3.displayDate();
		
		System.out.println("--------------------------------");
		
		MyDate d4 = new MyDate(30, "Mar", 1996);
		d4.displayDate();
	}

}
