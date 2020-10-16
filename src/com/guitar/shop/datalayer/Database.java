package com.guitar.shop.datalayer;

import com.guitar.shop.model.Manager;
import com.guitar.shop.model.Person;
import com.guitar.shop.model.SalesRepresentative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Database {
    private static List<SalesRepresentative> salesRepresentatives = new ArrayList<>();
    private static List<Manager> managers = new ArrayList<>();

    public List<SalesRepresentative> getSalespersons() {return salesRepresentatives; }

    public List<Manager> getManagers() {return managers; }

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
