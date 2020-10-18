package com.guitar.shop.datalayer;

import com.guitar.shop.model.*;
import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.*;
import java.util.stream.Collectors;

public class Database {
    private static List<SalesRepresentative> salesRepresentatives = new ArrayList<>();
    private static List<Manager> managers = new ArrayList<>();
    private static List<ArticleInStock> articles = new ArrayList<>();

    public List<SalesRepresentative> getSalespersons() {return salesRepresentatives; }

    public List<Manager> getManagers() {return managers; }

    public List<ArticleInStock> articles(){return articles; }


    public Database() {
        createSalesRepresentatives();
        createManagers();

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

    public void inITAticles(){

        articles.add(new ArticleInStock(0,"Fender","Telecaster",false,ArticleType.REGULAR,1079.79,4));
        articles.add(new ArticleInStock(0,"Fender","Precision",false,ArticleType.BRASS,1300.40,5));
        articles.add(new ArticleInStock(0,"Simon","Pro Flame Maple",true,ArticleType.REGULAR,1290.7,6));
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
}
