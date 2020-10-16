package com.guitar.shop.userinterface;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Article;
import com.guitar.shop.model.Manager;
import com.guitar.shop.model.SalesRepresentative;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

public class OrderPage {

    Stage stage;
    private Database db;
    private ObservableList<SalesRepresentative> salesrepresentative;
    private ObservableList<Manager> managers;
    public OrderPage(){

        // initialise data
        db = new Database();
        salesrepresentative = FXCollections.observableArrayList(db.getSalespersons());
        managers = FXCollections.observableArrayList(db.getManagers());

        HBox layout = new HBox();
        layout.setPadding(new Insets(20));
        layout.setSpacing(20);

        Label makeOrderLabel = new Label();
        makeOrderLabel.setText("Create Order # 1000002");
        makeOrderLabel.getStyleClass().add("header");

        TextField searchCustomerField = new TextField();
        searchCustomerField.setPromptText("Enter name");

        Button searchButton = new Button();
        searchButton.setText("Search");

        Label articleLabel = new Label();
        articleLabel.setText("Articles");

        TableView<Article> articleTableview = new TableView<>();
        articleTableview.setEditable(true);
        articleTableview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        TableColumn quantityCol = new TableColumn("Quantity");
        quantityCol.setMinWidth(100);
        quantityCol.






    }

}
