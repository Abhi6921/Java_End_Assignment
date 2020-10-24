package com.guitar.shop.userinterface;

import com.guitar.shop.model.GuitarType;
import com.guitar.shop.model.ConfirmOrder;
import com.guitar.shop.model.Customer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class ConfirmOrderPage {

    Stage stage;
    Customer customer;
    ObservableList<ConfirmOrder> orderInfo = FXCollections.observableArrayList();

    public ConfirmOrderPage(){

        stage = new Stage();
        stage.setTitle("GuitarShop FX- ConfirmOrder");
        stage.setMinWidth(600);

        Label customerLabel = new Label();
        customerLabel.setText("Customer");

        Label firstNameLabel = new Label();
        firstNameLabel.setText(customer.getFirstName());

        Label lastNameLabel = new Label();
        lastNameLabel.setText(customer.getLastName());

        Label adressLabel = new Label();
        adressLabel.setText(customer.getStreetAdress());

        Label cityLabel = new Label();
        cityLabel.setText(customer.getCity());

        Label phoneLabel = new Label();
        phoneLabel.setText(customer.getPhone());

        TableView<ConfirmOrder> tableView = new TableView<>();

        // add the columns
        TableColumn<ConfirmOrder, Integer> quantityCol = new TableColumn<>("Quantity");
        quantityCol.setMinWidth(200);
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        TableColumn<ConfirmOrder,String> brandCol = new TableColumn<>("Brand");
        brandCol.setMinWidth(200);
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));

        TableColumn<ConfirmOrder, String> modelCol = new TableColumn<>("Model");
        modelCol.setMinWidth(200);
        modelCol.setCellValueFactory(new PropertyValueFactory<>("model"));

        TableColumn<ConfirmOrder, GuitarType> typeCol = new TableColumn<>("Type");
        typeCol.setMinWidth(200);
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<ConfirmOrder,Double> priceCol = new TableColumn<>("Price");
        priceCol.setMinWidth(200);
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        tableView.setItems(orderInfo);

        tableView.getColumns().addAll(quantityCol,brandCol,modelCol,typeCol,priceCol,priceCol);


        Button confirmButton = new Button();
        confirmButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

            }
        });






    }
}
