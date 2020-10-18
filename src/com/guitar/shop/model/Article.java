package com.guitar.shop.model;

public class Article {

    public int quantity;
    public String brand;
    public String model;
    public Boolean Acoustic;
    public ArticleType type;
    public Double price;


    public Article(int quantity,String brand, String model,Boolean Acoustic, ArticleType type, Double price)
    {
        this.quantity = quantity;
        this.brand = brand;
        this.model = model;
        this.Acoustic = Acoustic;
        this.type = type;
        this.price = price;

    }


}
