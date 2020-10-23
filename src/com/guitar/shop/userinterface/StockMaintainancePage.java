package com.guitar.shop.userinterface;

import javafx.stage.Stage;

import java.awt.*;

public class StockMaintainancePage {

    Stage stage;

    public StockMaintainancePage(){

        stage = new Stage();
        stage.setTitle("GuitarShop FX- Stock maintainance");
        stage.setMinWidth(600);
        stage.setHeight(800);

        Menu homeMenu = new Menu("Home");
        Menu salesMenu = new Menu("Sales");



    }
}
