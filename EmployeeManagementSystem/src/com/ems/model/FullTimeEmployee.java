package com.ems.model;

public class FullTimeEmployee extends Employee{
      		private double monthlySalary;
      		  
      		public FullTimeEmployee(int empid,String name, Department department,Address address, double monthlySalary) {
      			super(empid,name,department,address);
      			this.monthlySalary= monthlySalary;
      		}
      		@Override
      		public double calculateSalary() {
      			return monthlySalary;
      		}
}
