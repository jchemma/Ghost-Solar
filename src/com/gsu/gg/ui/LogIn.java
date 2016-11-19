package com.gsu.gg.ui;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.User;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
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
        grid.setHgap(20);
        grid.setVgap(10);
        grid.setPadding(new Insets(10,10,10,10));
        grid.setAlignment(Pos.CENTER);
        
        
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
        
        submit.setOnKeyPressed(new EventHandler<KeyEvent>()
        {
            public void handle(KeyEvent ke)
            {
                if (ke.getCode().equals(KeyCode.ENTER))
                {
                	try {
                        user = RegistrationManager.loginUser(userNameField.getText(), passwordField.getText());
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
                        user = RegistrationManager.loginUser(userNameField.getText(), passwordField.getText());
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
                        user = RegistrationManager.loginUser(userNameField.getText(), passwordField.getText());
                    } catch (Exception e1) {
                        // TODO Auto-generated catch block
                        e1.printStackTrace();
                    }
                    window.close();
                }
            }
        });
        
        grid.add(submit,0,2);
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e ->System.exit(0));
        grid.add(cancel,1,2);
        
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
        
        Scene scene = new Scene(grid, 300, 150);
        window.setScene(scene);
        window.showAndWait();
        return user!=null;
    }
    public User getUser(){
        return user;
    }
}