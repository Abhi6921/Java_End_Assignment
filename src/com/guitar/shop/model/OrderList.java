package com.guitar.shop.model;

public class OrderList extends Customer {


    private int Count;
    private Double Total;

    public OrderList(String firstName, String LastName, String streetAdress, String city, String phone, String Email,int count, Double total){
        super(firstName,LastName,streetAdress,city,phone,Email);
        this.Total = total;
        this.Count = count;

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


}
