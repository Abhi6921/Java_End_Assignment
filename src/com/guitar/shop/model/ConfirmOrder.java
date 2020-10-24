package com.guitar.shop.model;

public class ConfirmOrder {

    private int quantity;
    private String brand;
    private String model;
    private GuitarType type;
    private double price;

    public ConfirmOrder(int quantity, String brand, String model, GuitarType type, double price) {
        this.quantity = quantity;
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
    }
}
