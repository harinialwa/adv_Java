package com;

public class Employee {

	private static Employee emp;

	public Employee() {

	}

	public static Employee getEmployee() {
		
		if (emp==null) {
			emp = new Employee();
		}
		return emp;
	}

}
