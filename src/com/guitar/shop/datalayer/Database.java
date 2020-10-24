package com.guitar.shop.datalayer;

import com.guitar.shop.model.*;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Database {
    private static Customer currentlySelectedCustomer = null;

    private static List<SalesRepresentative> salesRepresentatives = new ArrayList<>();
    private static List<Manager> managers = new ArrayList<>();
    private static List<Article> articles = new ArrayList<>();
    private static List<Customer> customers = new ArrayList<>();

    public List<SalesRepresentative> getSalespersons() {return salesRepresentatives; }

    public List<Manager> getManagers() {return managers; }



    public Database() {
        createSalesRepresentatives();
        createManagers();
        createCustomers();
        createArticles();
    }

    public void createCustomers() {
        customers.add(new Customer("John", "Dow", "Äddress1", "Ämsterdam", "509438", "john.dow@gmail.com"));
        customers.add(new Customer("Emily", "Dow", "Äddress1", "Ämsterdam", "509438", "john.dow@gmail.com"));
        customers.add(new Customer("Sarah", "Dow", "Äddress1", "Ämsterdam", "509438", "john.dow@gmail.com"));
    }

    public void createSalesRepresentatives() {
        salesRepresentatives.add(new SalesRepresentative("Clude Savage","Savage","clude","clude67"));
        salesRepresentatives.add(new SalesRepresentative("Oliver","Queen","oliver","oliver34"));
        salesRepresentatives.add(new SalesRepresentative("Criag","Key","gary","gary78"));
    }

    public void createManagers(){
        managers.add(new Manager("Felicity","Smoak","smoak","felicity34"));
        managers.add(new Manager("Abhishek", "Narvekar","abhishek06","abhi12"));
        managers.add(new Manager("John","Diggle","johntheboss","john9"));
    }

    public void createArticles(){

        articles.add(new Article(0,"Fender","Telecaster",false, GuitarType.REGULAR,1079.79));
        articles.add(new Article(0,"Fender","Precision",false, GuitarType.BRASS,1300.40));
        articles.add(new Article(0,"Simon","Pro Flame Maple",true, GuitarType.REGULAR,1290.7));
    }

    public static List<Article> getArticles() {
        return articles;
    }

    public Person findByUsername(String username) {
        ArrayList<Person> dbUsers = new ArrayList<Person>();
        dbUsers.addAll(salesRepresentatives);
        dbUsers.addAll(managers);
        return dbUsers.stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("User not found."));
    }

    public List<Customer> findCustomersByName(String searchText) {
        Predicate<Customer> isMatchingByName
                = customer -> customer.getFirstName().contains(searchText);
        return customers.stream().filter(isMatchingByName).collect(Collectors.toList());
    }
}
