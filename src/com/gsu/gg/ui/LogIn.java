package com.gsu.gg.ui;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.User;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LogIn{
    private User user;
    
    public boolean display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        window.setTitle("Log In");
        
        TextField userNameField = new TextField();
        userNameField.setPromptText("Username");
        GridPane.setColumnSpan(userNameField, 2);
        grid.add(userNameField,0,0);
        
        
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");
        GridPane.setColumnSpan(passwordField, 2);
        grid.add(passwordField, 0, 1);
        
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
        grid.add(submit,0,2);
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e ->System.exit(0));
        grid.add(cancel,1,2);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.showAndWait();
        return user!=null;
    }
    public User getUser(){
        return user;
    }
}