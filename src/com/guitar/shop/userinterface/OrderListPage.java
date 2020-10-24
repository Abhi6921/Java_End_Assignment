package com.guitar.shop.userinterface;

import com.guitar.shop.model.*;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalDate;

public class OrderListPage {

    Stage stage;

    public OrderListPage(){

        stage = new Stage();
        stage.setTitle("GuitarShop FX- View Order List");
        stage.setMinWidth(600);
        stage.setHeight(800);

        Menu homeMenu = new Menu("Home");
        Menu salesMenu = new Menu("salesMenu");

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().add(homeMenu);
        menuBar.getMenus().add(salesMenu);

        VBox vBox = new VBox(menuBar);

        TableView<OrderList> orderListTableView = new TableView<>();

        Label orderlabel = new Label();
        orderlabel.setText("Order List");
        orderlabel.setFont(Font.font(250));

        TableColumn<OrderList, Integer> orderNrCol = new TableColumn<>("Order #");
        orderNrCol.setMinWidth(100);
        orderNrCol.setCellValueFactory(new PropertyValueFactory<>("order"));

        TableColumn<OrderList, LocalDate> dateCol = new TableColumn<>("Date");
        dateCol.setMinWidth(100);
        dateCol.setCellValueFactory(new PropertyValueFactory<>("dateOfPurchase"));

        TableColumn<OrderList, String> firstNamecol = new TableColumn<>("FirstName");
        firstNamecol.setMinWidth(100);
        firstNamecol.setCellValueFactory(new PropertyValueFactory<>("firstname"));

        TableColumn<OrderList, String> lastNameCol = new TableColumn<>("LastName");
        lastNameCol.setMinWidth(100);
        lastNameCol.setCellValueFactory(new PropertyValueFactory<>("lastname"));

        TableColumn<OrderList, String> cityCol = new TableColumn<>("City");
        cityCol.setMinWidth(100);
        cityCol.setCellValueFactory(new PropertyValueFactory<>("city"));

        TableColumn<OrderList, String> phoneCol = new TableColumn<>("Phone #");
        phoneCol.setMinWidth(100);
        phoneCol.setCellValueFactory(new PropertyValueFactory<>("email"));

        TableColumn<OrderList, Integer> countCol = new TableColumn<>("Count");
        countCol.setMinWidth(100);
        countCol.setCellValueFactory(new PropertyValueFactory<>("count"));

        TableColumn<OrderList, Double> priceCol = new TableColumn<>("Total");
        priceCol.setMinWidth(100);
        priceCol.setCellValueFactory(new PropertyValueFactory<>("total"));


        Label detailsLabel = new Label();
        detailsLabel.setText("Details");
        detailsLabel.setFont(Font.font(200));

        TableView<ArticleDetails> articleDetailsTableView = new TableView<ArticleDetails>();

        TableColumn<ArticleDetails, String> uniqueNumberCol = new TableColumn<>("uuid");
        uniqueNumberCol.setMinWidth(100);
        uniqueNumberCol.setCellValueFactory(new PropertyValueFactory<>("uniqueNumber"));

        TableColumn<ArticleDetails, String> brandCol = new TableColumn<>("Brand");
        brandCol.setMinWidth(100);
        brandCol.setCellValueFactory(new PropertyValueFactory<>("brand"));

        TableColumn<ArticleDetails, ModelType> modelCol = new TableColumn<>("Model");
        modelCol.setMinWidth(100);
        modelCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<ArticleDetails, Boolean> acousticCol = new TableColumn<>("Acoustic");
        acousticCol.setMinWidth(100);
        acousticCol.setCellValueFactory(new PropertyValueFactory<>("acoustic"));

        TableColumn<ArticleDetails, GuitarType> typeCol = new TableColumn<>("Type");
        typeCol.setMinWidth(100);
        typeCol.setCellValueFactory(new PropertyValueFactory<>("articleType"));

        TableColumn<ArticleDetails, Double> ppriceCol = new TableColumn<>("Price");
        ppriceCol.setMinWidth(100);
        ppriceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<ArticleDetails, Integer> quantityCol = new TableColumn<>("Quantity");
        quantityCol.setMinWidth(100);
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));






    }
}
