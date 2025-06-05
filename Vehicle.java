package com.rental;

import jakarta.persistence.*;

@Entity
@Table(name = "Vehicle")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "brand")
    private String brand;
    @Column(name = "model")
    private String model;
    @Column(name = "type")
    private String type;
    @Column(name = "manufactureyear")
    private int manufactureyear;


    public Vehicle() {}

    public Vehicle(String brand, String model, String type, int manufactureyear) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.manufactureyear = manufactureyear;
    }

    public Long getId() { return id; }
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public int getManufactureyear() { return manufactureyear; }

    public void setId(Long id) { this.id = id; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setModel(String model) { this.model = model; }
    public void setType(String type) { this.type = type; }
    public void setManufactureyear(int manufactureyear) { this.manufactureyear = manufactureyear; }
}
