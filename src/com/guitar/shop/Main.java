package com.guitar.shop;

import com.guitar.shop.userinterface.*;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * 1. Check that all declared variables are based on JAVA Standard
 * 2. No brakcets on new lines. Starts from the same line. ex. Name { ....
 * 3. Group everything in small Methods no more then 10 lines.
 * 4. No MODEL Objects duplications!
 * 5. Rename properly your methods, classes and properties
 */

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Group root = new Group();

        Scene scene = new Scene(root, 300, 300);

        primaryStage.setTitle("Title Test");
        //primaryStage.setScene(scene);

        /*
        LoginPage loginPage = new LoginPage();

        loginPage.getStage().show();

         DashBoardPage page = new DashBoardPage();
        page.getStage().show();


        CustomerListPage page = new CustomerListPage();
        page.getStage().show();

        OrderPage page = new OrderPage();
        page.getStage().show();

         */

        StockMaintenancePage2 page = new StockMaintenancePage2();
        page.getStage().show();








        //primaryStage.show(loginPage.getStage().show());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
