package com.guitar.shop.controller;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Person;
import com.guitar.shop.model.SalesRepresentative;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.w3c.dom.xpath.XPathResult;
import javafx.scene.control.Alert;

public class LoginController implements EventHandler<ActionEvent> {

    Database db = new Database();
    ObservableList<SalesRepresentative> data = FXCollections.observableArrayList(db.getSalespersons());
    private int nrOfLoginAttempts = 3;
    Stage stage;


    @Override
   public void handle(ActionEvent event){

    }

    public void athenticate(String username, String password){
        Person person = db.findByUsername(username);


        if(!person.getPassword().equalsIgnoreCase(password)) {
            nrOfLoginAttempts--;
            throw new RuntimeException("Invalid User Credentials");
        }

        if (nrOfLoginAttempts==0)
        {
             stage = new Stage();
            stage.setMinWidth(200);
            stage.setMinHeight(100);

            Label label1 = new Label();
            label1.setText("Account Locked");

            Label label2 = new Label();
            label2.setText("Your account has been locked");

            Button okButton = new Button();
            okButton.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    stage.close();
                }
            });
        }
    }
}
