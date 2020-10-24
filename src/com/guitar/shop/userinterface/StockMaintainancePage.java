package com.guitar.shop.userinterface;

import com.guitar.shop.model.OrderList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.time.LocalDate;

public class StockMaintainancePage {

    Stage stage;

    public StockMaintainancePage(){

        stage = new Stage();
        stage.setTitle("GuitarShop FX- View Order List");
        stage.setMinWidth(600);
        stage.setHeight(800);

        javafx.scene.control.Menu homeMenu = new javafx.scene.control.Menu("Home");
        javafx.scene.control.Menu salesMenu = new javafx.scene.control.Menu("salesMenu");

        javafx.scene.control.MenuBar menuBar = new javafx.scene.control.MenuBar();
        menuBar.getMenus().add(homeMenu);
        menuBar.getMenus().add(salesMenu);

        VBox vBox = new VBox(menuBar);

        TableView<OrderList> orderListTableView = new TableView<>();

        javafx.scene.control.Label orderlabel = new javafx.scene.control.Label();
        orderlabel.setText("Order List");
        orderlabel.setFont(javafx.scene.text.Font.font(250));

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


        javafx.scene.control.Label detailsLabel = new Label();
        detailsLabel.setText("Details");
        detailsLabel.setFont(Font.font(200));

        Scene scene = new Scene(orderlabel);
        Scene scene1 = new Scene(orderListTableView);

        stage.setScene(scene);
        stage.setScene(scene1);
    }
    public Stage getStage(){return stage; }
}
