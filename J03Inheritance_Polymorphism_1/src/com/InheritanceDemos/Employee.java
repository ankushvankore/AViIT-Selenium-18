package com.InheritanceDemos;

public class Employee {
	private int empId;
	private String empName;
	protected double basicSalary;
	private String gender;
	
	public Employee() {
		empId = 101;
		empName = "Rutuja";
		basicSalary = 50000;
		gender = "Female";
	}
	
	public Employee(int id, String nm, double bs, String gn) {
		empId = id;
		empName = nm;
		basicSalary = bs;
		gender = gn;
	}
	
	public double calculateSalary() {
		double da, hra, pf, net;
		
		da = basicSalary * 0.50;
		hra = basicSalary * 0.20;
		pf = basicSalary * 0.05;
		net = basicSalary + da + hra - pf;
		
		return net;
	}
	
	public void displayData() {
		System.out.println("Employee Id  : " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Gender       : " + gender);
	}
}
