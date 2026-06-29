package com.ems.main;

import com.ems.model.*;
import com.ems.service.EmployeeService;

public class EmployeeManagementApp {

    public static void main(String[] args) {

        EmployeeService service =
                new EmployeeService();

        Address address1 =
                new Address(
                        "Coimbatore",
                        "Tamil Nadu",
                        "India");

        Address address2 =
                new Address(
                        "Erode",
                        "Tamil Nadu",
                        "India");
        Address address3=
        		new Address( "Erode",
                        "Tamil Nadu",
                        "India");

        service.addEmployee(

                new FullTimeEmployee(
                        101,
                        "Gokul",
                        Department.IT,
                        address1,
                        50000));

        service.addEmployee(

                new PartTimeEmployee(
                        102,
                        "Arun",
                        Department.HR,
                        address2,
                        50,
                        300));
        
        service.addEmployee(
        		new ContractEmployee(
        				103,
        				"Abul",
        				Department.SALES,
        				address3,
        				25000));

        service.displayEmployees();
    }
}