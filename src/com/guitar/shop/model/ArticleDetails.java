package com.guitar.shop.model;

public class ArticleDetails {

    private String uniqueNumber;
    private String brand;
    private ModelType type;
    private Boolean arcoustic;
    private GuitarType articleType;
    private Double price;
    private int quantity;

    public ArticleDetails(String uniquenumber, String brand, ModelType modeltype, GuitarType type, Boolean aroustic , Double price, int quantity ){

        this.uniqueNumber = uniquenumber;
        this.brand = brand;
        this.type = modeltype;
        this.arcoustic = aroustic;
        this.articleType = type;
        this.price = price;
        this.quantity = quantity;
    }
    public String getUniqueNumber(){return uniqueNumber; }
    public String getBrand(){return brand; }
    public ModelType getType(){return type; }
    public Boolean getArcoustic(){ return arcoustic; }
    public GuitarType getarticleType() {return articleType; }
    public Double getPrice() {return price; }
    public int getQuantity(){ return quantity; }

}

