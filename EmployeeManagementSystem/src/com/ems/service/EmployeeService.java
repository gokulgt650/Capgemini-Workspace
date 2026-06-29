package com.ems.service;

import java.util.ArrayList;
import com.ems.model.Employee;

public class EmployeeService {

    ArrayList<Employee> employees =
            new ArrayList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayEmployees() {

        for(Employee emp : employees) {

            emp.display();

            System.out.println(
                    "Salary : " +
                    emp.calculateSalary());

            System.out.println(
                    "-------------------");
        }
    }
}