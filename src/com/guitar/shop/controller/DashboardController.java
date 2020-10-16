package com.guitar.shop.controller;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.SalesRepresentative;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class DashboardController implements EventHandler<ActionEvent> {

    Database db = new Database();
    ObservableList<SalesRepresentative> data = FXCollections.observableArrayList(db.getSalespersons());
    
    @Override
    public void handle(ActionEvent event){

    }

}
