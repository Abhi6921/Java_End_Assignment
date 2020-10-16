package com.guitar.shop.userinterface;

import com.guitar.shop.controller.LoginController;
import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.Manager;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import com.guitar.shop.model.SalesRepresentative;

public class LoginPage {

    private LoginController loginController;
    private Stage stage;



    public LoginPage() {
        loginController = new LoginController();
        createPageGrid();
        createLoginBlock();
    }

    private void createLoginBlock(){
        // Login label
        Label loginLabel = new Label();
        loginLabel.setText("Login");

        // username label
        Label usernamelabel = new Label();
        usernamelabel.setText("Username:");

        // password label
        Label passwordlabel = new Label();
        passwordlabel.setText("Password:");

        // create textfield for username and password
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("Username");



        TextField passwordInput = new TextField();
        passwordInput.setPromptText("Password");

        String password = passwordInput.getText();

        Button loginButton = new Button();
        loginButton.setText("Login");

        //loginButton.setOnAction(event -> loginController.athenticate(usernameInput.getText(), passwordInput.getText()));

        loginButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                loginController.athenticate(usernameInput.getText(),passwordInput.getText());
            }
        });
        GridPane.setConstraints(usernamelabel,10,10);
        GridPane.setConstraints(usernameInput,11,10);
        GridPane.setConstraints(passwordlabel,10,11);
        GridPane.setConstraints(passwordInput,11,11);
        GridPane.setConstraints(loginButton,11,12);

        createLoginPage(usernamelabel,passwordlabel,usernameInput,passwordInput,loginButton);
    }

    private void createLoginPage(Label usernamelabel,
                                 Label passwordlabel,
                                 TextField usernameInput,
                                 TextField passwordInput,
                                 Button loginButton) {
        GridPane gridPane = new GridPane();
        stage = new Stage();
        stage.setHeight(600);
        stage.setWidth(800);
        stage.setTitle("Login Page");
        stage.setX(100);

        gridPane.getChildren().addAll(usernamelabel,passwordlabel,usernameInput,passwordInput,loginButton);

        Scene scene = new Scene(gridPane);
        stage.setScene(scene);
    }

    private void createPageGrid(){
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(8);
    }
    public Stage getStage() {
        return stage;
    }



}
