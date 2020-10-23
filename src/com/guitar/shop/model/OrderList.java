package com.guitar.shop.model;

import java.time.LocalDate;

public class OrderList extends Customer {

    private LocalDate dateOfPurchase;
    private int Count;
    private Double Total;

    public OrderList(String firstName, String LastName, String streetAdress, String city, String phone, String Email,int count, Double total, LocalDate dateOfPurchase){
        super(firstName,LastName,streetAdress,city,phone,Email);
        this.Total = total;
        this.Count = count;
        this.dateOfPurchase = dateOfPurchase;
    }
    public int getCount() {
        return Count;
    }

    public Double getTotal() {
        return Total;
    }
    public void setCount(int count) {
        Count = count;
    }

    public void setTotal(Double total) {
        Total = total;
    }
    public LocalDate getdateOfPurchase(){return dateOfPurchase; }
    public void setDateOfPurchase(LocalDate date) { dateOfPurchase = dateOfPurchase; }


}
