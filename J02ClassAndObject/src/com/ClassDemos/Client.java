package com.ClassDemos;

public class Client {

	public static void main(String[] args) {
		MyDate d1 = new MyDate();
		d1.setDay(21);
		int d = d1.getDay();
		System.out.println("Day: " + d);
		d1.displayDate();
	}

}
