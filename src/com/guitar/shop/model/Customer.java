package com.guitar.shop.model;

public class Customer {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String firstName;
    private String lastName;
    private String streetAdress;
    private String city;
    private String phone;
    private String email;

    public Customer(String firstName, String lastName, String streetAdress, String city, String phone, String email){

        this.firstName = firstName;
        this.lastName = lastName;
        this.streetAdress = streetAdress;
        this.city = city;
        this.phone = phone;
        this.email = email;

    }




}
