package com.guitar.shop.model;

public class Article {


    public int productId;
    public int quantity;
    public String brand;
    public String model;
    public Boolean acoustic;
    public GuitarType type;
    public Double price;

    public Article(int quantity, String brand, String model, Boolean Acoustic, GuitarType type, Double price) {
        this.quantity = quantity;
        this.brand = brand;
        this.model = model;
        this.acoustic = Acoustic;
        this.type = type;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getAcoustic() {
        return acoustic;
    }

    public void setAcoustic(Boolean acoustic) {
        this.acoustic = acoustic;
    }

    public GuitarType getType() {
        return type;
    }

    public void setType(GuitarType type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
