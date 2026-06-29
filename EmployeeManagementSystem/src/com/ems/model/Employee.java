package com.ems.model;

public abstract  class Employee {
	 protected int empId;
	 protected String name;
	 protected Department department;
	 protected Address address;

	public Employee(int empId,String name,Department department,Address address) {
		this.empId=empId;
		this.name=name;
		this.department=department;
		this.address=address;
		
	}
	public abstract double calculateSalary();
	

	public void display() {
		System.out.println("ID: "+empId);
		System.out.println("Name: "+name);
		System.out.println("Department : " + department);
	    System.out.println("Address : " + address);

	}

}
