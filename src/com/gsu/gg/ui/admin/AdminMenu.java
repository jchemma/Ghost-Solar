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
import com.gsu.gg.ui.Main;

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
        
        Button logout = new Button("Logout");
        logout.setOnAction(e -> {
            new Main().start(new Stage());
            window.close();
        });
        
        layout.getChildren().addAll(createNewUser, createNewClass, createNewSection, logout);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
}
