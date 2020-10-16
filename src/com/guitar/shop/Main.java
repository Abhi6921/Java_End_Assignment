package com.guitar.shop;

import com.guitar.shop.userinterface.DashBoardPage;
import com.guitar.shop.userinterface.LoginPage;
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

        primaryStage.setTitle("Title Test");
        //primaryStage.setScene(scene);

        /*
        LoginPage loginPage = new LoginPage();

        loginPage.getStage().show();

         */

        DashBoardPage page = new DashBoardPage();
        page.getStage().show();

        //primaryStage.show(loginPage.getStage().show());
    }


    public static void main(String[] args) {
        launch(args);
    }
}
