package com.PetAnimals_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PetAnimals_EntityClassHQL {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petID;
	private String name;
	private String color;
	private float weight;

	public PetAnimals_EntityClassHQL() {
	}

	public PetAnimals_EntityClassHQL(int petID, String name, String color, float weight) {
		super();
		this.petID = petID;
		this.name = name;
		this.color = color;
		this.weight = weight;
	}

	public int getPetID() {
		return petID;
	}

	public void setPetID(int petID) {
		this.petID = petID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return color;
	}

	public void setBreed(String breed) {
		this.color = breed;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "PetAnimals_Entity [petID=" + petID + ", name=" + name + ", color=" + color + ", weight=" + weight + "]";
	}
}
