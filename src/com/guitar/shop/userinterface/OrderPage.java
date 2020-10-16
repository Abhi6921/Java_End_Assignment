package com.guitar.shop.userinterface;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Article;
import com.guitar.shop.model.ArticleType;
import com.guitar.shop.model.Manager;
import com.guitar.shop.model.SalesRepresentative;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class OrderPage {

    Stage stage;
    private Database db;
    private ObservableList<SalesRepresentative> salesrepresentative;
    private ObservableList<Manager> managers;
    private ObservableList<Article> articles;
    public OrderPage(){

        stage = new Stage();
        stage.setTitle("GuitarshopFX - Create an Order");
        // initialise data
        db = new Database();
        salesrepresentative = FXCollections.observableArrayList(db.getSalespersons());
        managers = FXCollections.observableArrayList(db.getManagers());
        //articles = FXCollections.checkedObservableList();



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
        quantityCol.setCellValueFactory(new PropertyValueFactory<Article,Integer>("quantity"));

        TableColumn bandCol = new TableColumn("Band");
        bandCol.setMinWidth(100);
        bandCol.setCellValueFactory(new PropertyValueFactory<Article, String>("band"));

        TableColumn modelCol = new TableColumn("Model");
        modelCol.setMinWidth(100);
        modelCol.setCellValueFactory(new PropertyValueFactory<Article, String>("model"));

        TableColumn acousticCol = new TableColumn("Acoustic");
        acousticCol.setMinWidth(100);
        acousticCol.setCellValueFactory(new PropertyValueFactory<Article, Boolean>("Acoustic"));

        TableColumn typeCol = new TableColumn("Type");
        typeCol.setMinWidth(100);
        typeCol.setCellValueFactory(new PropertyValueFactory<Article, ArticleType>("type"));

        TableColumn priceCol = new TableColumn("Price");
        priceCol.setMinWidth(100);
        priceCol.setCellValueFactory(new PropertyValueFactory<Article, Double>("price"));

        articleTableview.getColumns().addAll(quantityCol,bandCol,modelCol,acousticCol,typeCol,priceCol);
        articleTableview.setItems(articles);

        Button addButton = new Button();
        addButton.setText("Add");

        Button deleteButton = new Button();
        deleteButton.setText("Remove");

        Button confirmButton = new Button();
        confirmButton.setText("Confirm");

        Button resetButton = new Button();
        resetButton.setText("Reset");

        VBox layout = new VBox();
        //layout.setPadding(new Insets(10));
        layout.setSpacing(20);

        HBox form = new HBox();
        //form.setPadding(new Insets(10));
        form.setSpacing(20);

        form.getChildren().addAll(addButton,deleteButton,confirmButton,resetButton);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

        
    }

}
