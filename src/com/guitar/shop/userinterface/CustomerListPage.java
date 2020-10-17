package com.guitar.shop.userinterface;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;
import java.util.List;

public class CustomerListPage {

    Stage stage;
    private ObservableList<Customer> customers;

    public CustomerListPage(){

        stage = new Stage();
        stage.setTitle("GuitarShopFX-Search customer");

        stage.setMinWidth(600);

        Database db = new Database();

        customers = FXCollections.observableArrayList(db.getCustomers());

        Label customerlistlabel = new Label();
        customerlistlabel.setText("Customer List");
        customerlistlabel.setFont(Font.font(50));

        TableView<Customer> customerTableView = new TableView<>();
        customerTableView.setEditable(true);
        customerTableView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        TableColumn firstNameCol = new TableColumn("First Name");
        firstNameCol.setMinWidth(100);
        firstNameCol.setCellValueFactory(new PropertyValueFactory<>("firstName"));

        TableColumn lastNameCol = new TableColumn("Last Name");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastName"));

        TableColumn streetAdressCol = new TableColumn("Street Adress");
        streetAdressCol.setMinWidth(100);
        streetAdressCol.setCellValueFactory(new PropertyValueFactory<>("streetAdress"));

        TableColumn cityCol = new TableColumn("City");
        cityCol.setMinWidth(100);
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));

        TableColumn phoneCol = new TableColumn("Phone #");
        phoneCol.setMinWidth(100);
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("phone"));

        TableColumn emailCol = new TableColumn("Email");
        emailCol.setMinWidth(100);
        emailCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        customerTableView.getColumns().addAll(firstNameCol,lastNameCol,streetAdressCol,cityCol,phoneCol,emailCol);

        customerTableView.setItems(customers);



        VBox customerPane = new VBox();
        customerPane.getChildren().addAll(customerlistlabel,customerTableView);

        Scene scene = new Scene(customerPane);
        stage.setScene(scene);


    }
    public Stage getStage(){return stage; }



}
