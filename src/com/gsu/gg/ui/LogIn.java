package com.gsu.gg.ui;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.User;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class LogIn{
    private User user;

    public boolean display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        window.setTitle("Log In");

        //Add a label
        Label heading = new Label("Ghost Solar");
        heading.setId("Heading-text");

        //add a welcome label over textfields
        Label welcome = new Label("Welcome");
        welcome.setId("Welcome-text");

        //add heading and welcome to grid
        grid.add(heading, 0, 0);
        grid.add(welcome, 0, 1);
        TextField userNameField = new TextField();
        userNameField.setPromptText("Username");
        GridPane.setColumnSpan(userNameField, 2);
        grid.add(userNameField,0,2);
        grid.setHgap(20);
        grid.setVgap(5);
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);


        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        GridPane.setColumnSpan(passwordField, 2);
        grid.add(passwordField, 0, 4);

        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            try {
                user = RegistrationManager.loginUser(userNameField.getText(), passwordField.getText());
            } catch (Exception e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            window.close();
        });

        submit.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                	try {
                        user = RegistrationManager.loginUser(userNameField.getText().toLowerCase(), passwordField.getText());
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.close();
                }
            }
        });

        userNameField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                	try {
                        user = RegistrationManager.loginUser(userNameField.getText().toLowerCase(), passwordField.getText());
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.close();
                }
            }
        });

        passwordField.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                	try {
                        user = RegistrationManager.loginUser(userNameField.getText().toLowerCase(), passwordField.getText());
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.close();
                }
            }
        });
        
        //Create an HBox to hold the buttons 
        HBox bBox = new HBox(10);
        //grid.add(submit,0,4);
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e ->System.exit(0));
        //grid.add(cancel,1,4);
        //place buttons on Hbox to center them against 
        //textboxes even if scene is resized
        bBox.getChildren().addAll(submit, cancel);
        bBox.setAlignment(Pos.CENTER);
        //add HBox to grid.
        grid.add(bBox, 0, 6);
        
        window.setOnCloseRequest(e -> System.exit(0));

        cancel.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                	try {
                		System.exit(0);
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.close();
                }
            }
        });
        
        //add two Hyperlink buttons Create new Account and forgot Password
        Hyperlink pWord	= new Hyperlink("Forgot Password?");
        Hyperlink uName = new Hyperlink("Forgot Username?");
        pWord.setId("Hyper-Button");
        uName.setId("Hyper-Button");
        grid.add(uName, 0, 3);
        grid.add(pWord, 0, 5);
       
        Scene scene = new Scene(grid, 300, 275);
        scene.getStylesheets().add("com/gsu/gg/ui/loginStyle.css");
        window.setScene(scene);
        window.showAndWait();
        return user!=null;

    }
    public User getUser(){
        return user;
    }
}