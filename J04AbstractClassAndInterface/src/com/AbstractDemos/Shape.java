package com.AbstractDemos;

public abstract class Shape {
	public abstract void calculateArea();
	//Abstract methods don't have implementation
	
	public void sayHello() {
		System.out.println("Hello, this is Shape class");
	}
}
