package com.Bank_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Bank_EntityClassHQL")
public class Bank_EntityClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankID;
	private String Name;
	private String Position;
	private String Address;
	private float Salary;
	
	
	
	public Bank_EntityClass() {
		
	}


	public Bank_EntityClass(int bankID, String name, String position, String address, float salary) {
		super();
		this.bankID = bankID;
		Name = name;
		Position = position;
		Address = address;
		Salary = salary;
	}



	public int getBankID() {
		return bankID;
	}


	public void setBankID(int bankID) {
		this.bankID = bankID;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPosition() {
		return Position;
	}


	public void setPosition(String position) {
		Position = position;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public float getSalary() {
		return Salary;
	}


	public void setSalary(float salary) {
		Salary = salary;
	}


	@Override
	public String toString() {
		return "Bank_EntityClass [bankID=" + bankID + ", Name=" + Name + ", Position=" + Position + ", Address="
				+ Address + ", Salary=" + Salary + "]";
	}
	
}
