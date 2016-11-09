package com.gsu.gg.ui;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class AlertBox{
    String message;
    String message1;
    
    public AlertBox(String message, String message1){
        this.message = message;
        this.message1 = message1;
    }
    
    public void display(){
        Alert alert = new Alert(AlertType.ERROR);
        alert.setTitle("Error: Incorrect Pawword");
        alert.setHeaderText(message1);
        alert.setContentText(message);
        alert.showAndWait();
    }
}