package com.guitar.shop.userinterface;

import com.guitar.shop.datalayer.Database;
import com.guitar.shop.model.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.DataFormat;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Calendar;

public class DashBoardPage {

    Stage stage;
    Person person;
    public DashBoardPage()
    {
        stage = new Stage();
        stage.setTitle("GuitarshopFX-Dashboard");


        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(10);
        gridPane.setHgap(8);

        Database db = new Database();

        ObservableList<SalesRepresentative> salesRepresentatives = FXCollections.observableArrayList(db.getSalespersons());

        ObservableList<Manager> managers = FXCollections.observableArrayList(db.getManagers());

        MenuBar menubar = new MenuBar();

        VBox box = new VBox(menubar);
        // home menu
        Menu homemenu = new Menu("Home");

        // sales
        Menu salesmenu = new Menu("Sales");

        MenuItem order = new MenuItem("Order");
        MenuItem listorders = new MenuItem("List Orders");

        salesmenu.getItems().add(order);
        salesmenu.getItems().add(listorders);

        // stock menu
        Menu stockMenu = new Menu("Stock");

        MenuItem maintainitems = new MenuItem("Maintain");

        stockMenu.getItems().add(maintainitems);

        menubar.getMenus().add(homemenu);
        menubar.getMenus().add(salesmenu);

        Label welcomelabel = new Label();



        Label rolelabel = new Label("Your role is " + EmployeeType.SALES_REPRESENTATIVE);

        DataFormat dateFormat = new DataFormat("yyyy/MM/dd HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        Label datelabel = new Label("Today is: " + cal.toString());


        Label label1 = new Label();
        label1.setText("This is a text message");
        label1.setFont(new Font(20));
        WelcomeMessage message;

        Label label2 = new Label();
        label2.setText("This is another text message");
        label2.setFont(new Font(40));
        WelcomeMessage message1;

        //GridPane.setConstraints(welcomelabel,13,10);
        GridPane.setConstraints(rolelabel,11,10);
        GridPane.setConstraints(datelabel, 12,10);



    }
    public Stage getStage() { return stage; }
}
