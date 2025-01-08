package com.Cloths_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cloths_EntityClassHQL {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clothID;
	private String Name;
	private String Type;
	private String Size;
	private float Price;

	public Cloths_EntityClassHQL() {
	}

	public Cloths_EntityClassHQL(int clothID, String name, String type, String size, float price) {
		super();
		this.clothID = clothID;
		Name = name;
		Type = type;
		Size = size;
		Price = price;
	}

	public int getClothID() {
		return clothID;
	}

	public void setClothID(int clothID) {
		this.clothID = clothID;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Cloths_EntityClass [clothID=" + clothID + ", Name=" + Name + ", Type=" + Type + ", Size=" + Size
				+ ", Price=" + Price + "]";
	}
}
