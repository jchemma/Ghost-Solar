package com.gsu.gg.ui.admin;

import java.util.Optional;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.User;
import com.sun.java.swing.plaf.windows.resources.windows;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RemoveUser {
	User user;
	
	public void display(){
		Stage window = new Stage();
		TextField firstName = new TextField("First Name");
		TextField lastName = new TextField("Last Name");
		TextField email = new TextField("Email");
		
		Button submit = new Button("Submit");
		submit.setOnAction(e -> {
			Alert alert = new Alert(AlertType.CONFIRMATION);
			alert.setTitle("DELETE USER CONFIRMATION");
			alert.setHeaderText("Are you sure you want to remove this user?");
			Optional<ButtonType> result = alert.showAndWait();
			if(result.get()==ButtonType.OK){
				try {
					
					RegistrationManager.removeUser(RegistrationManager.getUser(email.getText()));
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}else{
				window.close();
			}
		});
		Button cancel = new Button("Cancel");
		cancel.setOnAction(e -> window.close());
		
		HBox hbox = new HBox();
		hbox.getChildren().addAll(submit,cancel);
		
		VBox vbox = new VBox();
		vbox.getChildren().addAll(firstName,lastName,email,hbox);
		
		Scene scene = new Scene(vbox);
		window.setTitle("Remove User");
		window.setScene(scene);
		window.show();
	}
}
