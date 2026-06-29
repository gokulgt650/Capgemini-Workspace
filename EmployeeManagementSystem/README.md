# 🗂️ Employee Management System (EMS)

A console-based Java application built using **Core Java** and **Object-Oriented Programming** concepts.

---

## 📌 Description

The EMS manages different types of employees and their salary calculations using Java OOP principles such as inheritance, abstraction, polymorphism, and encapsulation.

**Employee details stored:**
- Employee ID, Name, Department, Address, Salary

---

## 🛠️ Technologies Used

- Java (JDK 17+)
- Eclipse IDE
- Core Java & Collection Framework (ArrayList)

---

## 📁 Project Structure

```
EmployeeManagementSystem/
└── src/
    └── com.ems/
        ├── model/
        │   ├── Employee.java
        │   ├── FullTimeEmployee.java
        │   ├── PartTimeEmployee.java
        │   ├── ContractEmployee.java
        │   ├── Address.java
        │   └── Department.java
        ├── service/
        │   └── EmployeeService.java
        └── main/
            └── EmployeeManagementApp.java
```

---

## ✅ Features

- Add and display employee details
- Calculate salary based on employee type
- Department management using `Enum`
- Address management using a `Class`
- Polymorphic storage using `ArrayList<Employee>`

---

## 👥 Employee Types & Salary Formula

| Type | Formula |
|---|---|
| Full-Time | `Monthly Salary` |
| Part-Time | `Hours Worked × Rate Per Hour` |
| Contract | `Contract Amount` |

---

## 🧩 OOP Concepts Used

| Concept | Implementation |
|---|---|
| Encapsulation | Private fields with getters/setters |
| Inheritance | `FullTimeEmployee`, `PartTimeEmployee`, `ContractEmployee` extend `Employee` |
| Abstraction | `Employee` is an abstract class with `calculateSalary()` |
| Polymorphism | `ArrayList<Employee>` holds all employee types |
| Method Overriding | Each subclass overrides `calculateSalary()` |

---

## 🖥️ Sample Output

```
ID: 101 | Name: Gokul | Department: IT
Address: Coimbatore, Tamil Nadu, India
Salary: ₹50,000.0
---------------------
ID: 102 | Name: Arun | Department: HR
Address: Erode, Tamil Nadu, India
Salary: ₹15,000.0
---------------------
```

---

## 🚀 Future Enhancements

- Search / Update / Delete employee records
- MySQL database integration
- File handling for persistent storage
- Exception handling
- Java Swing / JavaFX GUI
- User login system

---

## 📚 Learning Outcomes

Java Packages · Classes & Objects · Constructors · Encapsulation · Inheritance · Abstraction · Polymorphism · Method Overriding · Enum · ArrayList · Console Application Development

---

## 👨‍💻 Author

**Gokul Balasubramaniyam**  
Core Java Mini Project · Eclipse IDE
