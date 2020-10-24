package com.guitar.shop.model;

public class ArticleInStock extends Article{

    public int amountInStock;
    public ArticleInStock(int quantity, String band , String model, Boolean acoustic, GuitarType type, double price, int amountInStock){
        super(quantity,band,model,acoustic,type,price);
        this.amountInStock = amountInStock;
    }
}
