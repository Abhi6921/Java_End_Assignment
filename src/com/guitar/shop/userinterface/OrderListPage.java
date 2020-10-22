package com.guitar.shop.userinterface;

import com.guitar.shop.model.OrderList;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
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

        TableView<OrderList> orderListTableView = new TableView<>();

        Label orderlabel = new Label();
        orderlabel.setText("Order List");
        orderlabel.setFont(Font.font(250));

        TableColumn<OrderList, Integer> orderNrCol = new TableColumn<>("Order #");
        orderNrCol.setMinWidth(100);
        orderNrCol.setCellValueFactory(new PropertyValueFactory<>("order"));

        TableColumn<OrderList, LocalDate> dateCol = new TableColumn<>();
        dateCol.setMinWidth(100);
        dateCol.setCellValueFactory(new PropertyValueFactory<>(""));
    }
}
