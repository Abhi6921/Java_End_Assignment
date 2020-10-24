package com.guitar.shop.userinterface;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalDate;

public class StockMaintenancePage2 {

    Stage stage;
    private Database db;
    private ObservableList<Article> articles;

    public StockMaintenancePage2(){

        stage = new Stage();
        stage.setTitle("GuitarShop FX- Stock maintenance");
        stage.setMinWidth(600);
        stage.setHeight(800);

        db = new Database();
        articles = FXCollections.observableArrayList(db.getArticles());

        Menu homeMenu = new Menu("Home");
        Menu salesMenu = new Menu("Sales");
        Menu stock = new Menu("Stock");

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(homeMenu);
        menuBar.getMenus().add(salesMenu);
        menuBar.getMenus().add(stock);

        VBox vBox = new VBox(menuBar);

        TableView<Article> orderListTableView = new TableView<>();

        Label orderlabel = new Label();
        orderlabel.setText("Stock maintenance");
        orderlabel.setFont(Font.font(50));

        TableColumn<Article, Integer> quantityCol = new TableColumn<>("Quantity");
        quantityCol.setMinWidth(100);
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        TableColumn<Article, String> brandCol = new TableColumn<>("Brand");
        brandCol.setMinWidth(100);
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));

        TableColumn<Article, String> modelCol = new TableColumn<>("Model");
        modelCol.setMinWidth(100);
        modelCol.setCellValueFactory(new PropertyValueFactory<>("model"));

        TableColumn<Article, Boolean> acousticCol = new TableColumn<>("Acoustic");
        acousticCol.setMinWidth(100);
        acousticCol.setCellValueFactory(new PropertyValueFactory<>("acoustic"));

        TableColumn<Article, GuitarType> guitarType = new TableColumn<>("Guitar Type");
        guitarType.setMinWidth(100);
        guitarType.setCellValueFactory(new PropertyValueFactory<>("type"));

        orderListTableView.setItems(articles);

        orderListTableView.setItems(articles);
        orderListTableView.getColumns().addAll(quantityCol, brandCol, modelCol, acousticCol, guitarType);

        VBox customerPane = new VBox();

        TextField searchCustomerField = new TextField();
        searchCustomerField.setPromptText("Quantity");
        searchCustomerField.onActionProperty();
        searchCustomerField.setMaxWidth(100);

        CheckBox negateCheckbox = new CheckBox();
        negateCheckbox.setSelected(false);
        negateCheckbox.setText("Negate");

        Button addButton = new Button();
        addButton.setText("Add");
        addButton.setOnAction(event -> {
            //Selected Item ID -> productId
            //Quantity TextField Integer Value
            //If Negate is selected to remove elements
            //Check if current amount is more than Negate amount
        });

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(8);
        gridPane.add(searchCustomerField, 0, 0, 1, 1);
        gridPane.add(negateCheckbox, 1, 0, 1, 1);
        gridPane.add(addButton, 2, 0, 1, 1);

        customerPane.getChildren().addAll(orderlabel,orderListTableView);
        customerPane.getChildren().addAll(gridPane);

        Scene scene = new Scene(customerPane);
        stage.setScene(scene);
    }
    public Stage getStage(){ return stage; }
}
