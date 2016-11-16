/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.gg.ui.admin;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.gsu.gg.to.User;

/**
 *
 * @author jchemma
 */
public class AdminMenu {
    
    User user;

    public AdminMenu(User user) {
        this.user = user;
    }

    public void display() {
        Stage window = new Stage();
        window.setTitle("Admin Menu");
        VBox layout = new VBox();
        
        Button createNewUser = new Button("Create New User");
        createNewUser.setOnAction(e -> new CreateUser().display());
        
        Button createNewClass = new Button("Create New Class");
        createNewClass.setOnAction(e -> new CreateNewClass().display());
        
        Button createNewSection = new Button("Create New Section");
        createNewSection.setOnAction(e -> new CreateSection().display());
        
        layout.getChildren().addAll(createNewUser, createNewClass, createNewSection);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
}
