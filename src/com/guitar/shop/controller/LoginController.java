package com.guitar.shop.controller;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Person;
import com.guitar.shop.model.SalesRepresentative;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.TextField;
import org.w3c.dom.xpath.XPathResult;

public class LoginController implements EventHandler<ActionEvent> {

    Database db = new Database();
    ObservableList<SalesRepresentative> data = FXCollections.observableArrayList(db.getSalespersons());



    @Override
   public void handle(ActionEvent event){

    }

    public void athenticate(String username, String password){
        Person person = db.findByUsername(username);
        //1.Retrieve the person type MANGER or SALES and pass it when loading the DashBoard.
        //2.Menu ITEMS are specific based on the person type
        if(!person.getPassword().equalsIgnoreCase(password)) {
            throw new RuntimeException("Invalid User Credentials");
        }
    }
}
