package com.ClassDemos;

public class EmployeeClient {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee.setCompany("Manorama");
		e1.displayData();
		double sal = e1.calculateSalary();
		System.out.println("Net Salary   : " + sal);
		
		System.out.println("-------------------------");
		
		Employee e2 = new Employee(111, "Dhanashri", 60000, "Female");
		e2.displayData();
		System.out.println("Net Salary   : " + e2.calculateSalary());
	}

}
