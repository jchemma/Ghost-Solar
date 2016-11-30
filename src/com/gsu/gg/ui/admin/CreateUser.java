/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.gg.ui.admin;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.User;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jchemma
 */
public class CreateUser {

    void display() {
        Stage window = new Stage();
        window.setTitle("Create New User");
        
        //TextFields
        TextField firstName = new TextField();
        firstName.setPromptText("First Name");
        TextField password = new TextField();
        password.setPromptText("Password");
        TextField email = new TextField();
        email.setPromptText("E-Mail");
        TextField lastName = new TextField();
        lastName.setPromptText("Last Name");
        ChoiceBox<Integer> accessLevel = new ChoiceBox(FXCollections.observableArrayList(1,2));
        
        Button submit = new Button("Submit");
        submit.setOnAction(e -> {
            User user = new User(firstName.getText().toLowerCase(), lastName.getText().toLowerCase(), email.getText().toLowerCase(),password.getText(),accessLevel.getValue());
            try {
                RegistrationManager.createUser(user);
            } catch (Exception ex) {
                Logger.getLogger(CreateUser.class.getName()).log(Level.SEVERE, null, ex);
            }
            window.close();
        });
        Button cancel = new Button("Cancel");
        cancel.setOnAction(e -> window.close());
        
        VBox layout = new VBox();
        layout.getChildren().addAll(firstName, lastName, password, email, accessLevel,submit, cancel);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
        
    }
    
}
