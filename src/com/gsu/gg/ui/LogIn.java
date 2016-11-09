package com.gsu.gg.ui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogIn{
    boolean loggedIn;
    public boolean display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        window.setTitle("Log In");
        
        Label userName = new Label("Username: ");
        grid.add(userName, 0, 0);
        Label password = new Label("Password");
        grid.add(password, 0, 1);
        
        TextField userNameField = new TextField();
        grid.add(userNameField,1,0);
        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 1);
        
        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            loggedIn = check(userNameField.getText(), passwordField.getText());
            window.close();
        });
        grid.add(submit,0,2);
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e ->System.exit(0));
        grid.add(cancel,1,2);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.showAndWait();
        return loggedIn;
    }
    
    private boolean check(String username, String password){
        return username.equals("admin") && password.equals("password");
    }
}