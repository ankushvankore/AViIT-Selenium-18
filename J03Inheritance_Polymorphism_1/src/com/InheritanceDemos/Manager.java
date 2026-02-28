package com.InheritanceDemos;

public class Manager extends Employee{
	private double sales;
	private double rate;
	
	public Manager() {
		super();					//Will call plain constructor of base class
		sales = 0;
		rate = 0;
	}
	
	public Manager(int id, String nm, double bs, String gn, double s, double r) {
		super(id, nm, bs, gn);		//Will call parameterized constructor of base class
		sales = s;
		rate = r;
	}
	
	public void displayData() {
		super.displayData();
		System.out.println("Sales        : " + sales);
		System.out.println("Rate         : " + rate);
	}
	
	public double calculateInentive() {
		System.out.println("Basic Salary: " + basicSalary);
		return sales * rate;
	}
	
	public double calculateSalary() {
		return (super.calculateSalary() + calculateInentive());
	}
}
