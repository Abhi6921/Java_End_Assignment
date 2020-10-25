package com.guitar.shop;

import com.guitar.shop.userinterface.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();

        Scene scene = new Scene(root, 300, 300);

        LoginPage loginPage = new LoginPage();
        loginPage.getStage().show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
