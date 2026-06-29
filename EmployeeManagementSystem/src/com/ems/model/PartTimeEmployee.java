package com.ems.model;

public class PartTimeEmployee extends Employee {
	private int hoursworked;
	private double rateperhour;
	
	public PartTimeEmployee(int empid,String name,Department department,Address address,int hoursworked,double rateperhour) {
		super(empid,name,department, address);
		
		this.hoursworked=hoursworked;
		this.rateperhour=rateperhour;
	}
	@Override
	public double calculateSalary() {
		return hoursworked*rateperhour;
	}

}
