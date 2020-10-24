package com.guitar.shop.userinterface;

import com.guitar.shop.model.Article;
import com.guitar.shop.model.ArticleInStock;
import com.guitar.shop.model.GuitarType;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AddArticlePage {

    Stage stage;
    TableView<Article> articles;
    ArticleInStock stock;
    public AddArticlePage(){

        stage = new Stage();
        stage.setTitle("Guitarshop FX- Add article");
        stage.setMinWidth(450);

        TableColumn<Article, String> bandCol = new TableColumn<>("Brand");
        bandCol.setMinWidth(200);
        bandCol.setCellValueFactory(new PropertyValueFactory<>("band"));

        TableColumn<Article, String> modelCol = new TableColumn<>("Model");
        modelCol.setMinWidth(200);
        modelCol.setCellValueFactory(new PropertyValueFactory<>("model"));

        TableColumn<Article, Boolean> acousticCol = new TableColumn<>("Acoustic");
        acousticCol.setMinWidth(200);
        acousticCol.setCellValueFactory(new PropertyValueFactory<>("Acoustic"));

        TableColumn<Article, GuitarType> typeCol = new TableColumn<>("Type");
        typeCol.setMinWidth(200);
        typeCol.setCellValueFactory(new PropertyValueFactory<>("type"));

        TableColumn<Article, Double> priceCol = new TableColumn<>("Price");
        priceCol.setMinWidth(200);
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        articles = new TableView<>();

        TextField inputNrOfArticles = new TextField();
        inputNrOfArticles.setPromptText("Enter number");

        int nrOfArticles = Integer.parseInt(inputNrOfArticles.getText());

        Button addButton = new Button("Add");

        addButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {

               if (stock.amountInStock > 11)
               {
                   Label label = new Label();
                   label.setText("Not enough stock for " + stock.brand + " Only " + stock.amountInStock + " remaining");

                   inputNrOfArticles.clear();
               }

            }
        });

        Button cancelButton = new Button("Cancel");

        HBox form = new HBox();
        form.setPadding(new Insets(10));
        form.setSpacing(10);
        form.getChildren().addAll(inputNrOfArticles,addButton,cancelButton);

        VBox layout = new VBox();
        layout.getChildren().addAll(articles);
        layout.getChildren().add(form);

        Scene scene = new Scene(layout);
        stage.setScene(scene);
        stage.show();

    }
}
