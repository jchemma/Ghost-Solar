package com.gsu.gg.ui;

import com.gsu.gg.to.User;
import com.gsu.gg.ui.admin.AdminMenu;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application{

	User user;

	public static void main(String[]args){
		launch(args);
	}
        @Override
	public void start(Stage window){
		LogIn login = new LogIn();
		int counter = 0;
		while(counter < 3){
			if(login.display()){
				user = login.getUser();
				break;
			}else if(counter < 2){
				counter++;
				Alert wrongPassword = new Alert(AlertType.ERROR);
				wrongPassword.setTitle("WRONG PASSWORD");
				wrongPassword.setHeaderText("Wrong Password");
				wrongPassword.setContentText("The password you have entered is incorrect. You have "+(3-counter)+ " attempts left.");
				wrongPassword.showAndWait();
			}else{
				Alert wrongPassword = new Alert(AlertType.WARNING);
				wrongPassword.setTitle("MAX ATTEMPTS");
				wrongPassword.setHeaderText("Max Attempts");
				wrongPassword.setContentText("Max attempts reached. Closing Program...");
				wrongPassword.showAndWait();
				System.exit(0);
			}
		}
		switch(user.getAccessType()){
                    case 1:
                        new AdminMenu(user).display();
                        break;
                    case 2:
                        new RegistrationMenu(user).display();
                }
	}
}