package com.AbstractDemos;

public class Rectangle extends Shape implements PrintInfo{
	int length;
	int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public void calculateArea() {
		int area = length * breadth;
		System.out.println("Area of Rectangle: " + area);
	}
	
	public void print() {
		System.out.println("This is Rectangle class");
	}
}
