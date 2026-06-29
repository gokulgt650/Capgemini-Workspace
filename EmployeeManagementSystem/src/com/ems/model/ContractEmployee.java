package com.ems.model;

public class ContractEmployee extends Employee {

    private double contractAmount;

    public ContractEmployee(int empId,String name,Department department,Address address, double contractAmount) {

        super(empId, name, department, address);

        this.contractAmount = contractAmount;
    }

    @Override
    public double calculateSalary() {
        return contractAmount;
    }
}