package com.InheritanceDemos;

public class Polymorphism {

	public static void main(String[] args) {
		Employee emp;
		//emp - Reference of base class
		//Reference of base class is known as "Generic Reference".
		//Generic reference can hold address of derived class object.
		Employee e1 = new Employee(456, "Sarvesh", 50000, "Male");
		
		emp = e1;

		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		System.out.println("------------------------------------");
		
		Manager m1 = new Manager(852, "Sayalee", 60000, "Female", 50000, 0.05);
		emp = m1;
		
		emp.displayData();
		System.out.println("Net Salary   : " + emp.calculateSalary());
		
		final double pi = 3.142;
		//pi = 45;
	}

}
