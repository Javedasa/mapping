package com.example.learnmapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {
    @Id
    private Integer laptopId;
    private String brand;
    private int price;

    public Laptop(int laptopId, String brand, int price) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.price = price;
    }
    @OneToOne(mappedBy = "laptop",cascade = CascadeType.ALL)
    private Student student;
    public Laptop() {
    }

    public void setLaptopId(Integer laptopId) {
        this.laptopId = laptopId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
