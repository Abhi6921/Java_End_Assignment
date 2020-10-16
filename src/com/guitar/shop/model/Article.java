package com.guitar.shop.model;

public class Article {

    private int quantity;
    private String band;
    private String model;
    private Boolean Acoustic;
    private ArticleType type;

    public Article(int quantity,String band, String model,Boolean Acoustic, ArticleType type)
    {
        this.quantity = quantity;
        this.band = band;
        this.model = model;
        this.Acoustic = Acoustic;
        this.type = type;
    }

}
