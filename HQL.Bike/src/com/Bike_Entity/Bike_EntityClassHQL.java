package com.Bike_Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Bike_EntityClassHQL {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bikeID;
    private String Model;
    private String Color;
    private float Price;

    
    public Bike_EntityClassHQL() {
    }

    
    public Bike_EntityClassHQL(int bikeID, String model, String color, float price) {
        super();
        this.bikeID = bikeID;
        Model = model;
        Color = color;
        Price = price;
    }

  
    public int getBikeID() {
        return bikeID;
    }

    public void setBikeID(int bikeID) {
        this.bikeID = bikeID;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "Bike_EntityClass [bikeID=" + bikeID + ", Model=" + Model + ", Color=" + Color
                + ", Price=" + Price + "]";
    }
}
