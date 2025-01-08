package com.Employee_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Employee_EntityClassHQL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;
    private String name;
    private String position;
    private String address;
    private int salary;

   
    public Employee_EntityClassHQL() {
    }

   
    public Employee_EntityClassHQL(int employeeID, String name, String position, String address, int salary) {
        super();
        this.employeeID = employeeID;
        this.name = name;
        this.position = position;
        this.address = address;
        this.salary = salary;
    }


    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee_EntityClass [employeeID=" + employeeID + ", name=" + name + ", position=" + position + ", address=" + address + ", salary=" + salary + "]";
    }
}
