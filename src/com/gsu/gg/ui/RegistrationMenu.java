package com.gsu.gg.ui;

import java.io.IOException;
import java.net.URI;

import com.gsu.gg.to.User;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class RegistrationMenu {

	User user;

	public RegistrationMenu(User user) {
		this.user = user;
	}

	Stage window;

<<<<<<< HEAD
	public Stage display() {
		Stage window = new Stage();
		GridPane grid = new GridPane();

		// Buttons
		Button checkRegistrationStatus = new Button("Check Registration Status and Appointment Times");
		checkRegistrationStatus.setOnAction(e -> {
			String option = new SelectTerm().display();
			System.out.println(option);
		});
		grid.add(checkRegistrationStatus, 0, 1);
		checkRegistrationStatus.setMinWidth(250);

		Button addDropWithdrawClasses = new Button("Add/Drop/Withdraw Classes");
		addDropWithdrawClasses.setOnAction(e -> new AddDropWithdrawClasses(user).display());
		grid.add(addDropWithdrawClasses, 0, 2);
		addDropWithdrawClasses.setMinWidth(250);

		Button lookUpClassesToAdd = new Button("Look-Up Classes to Add");
		lookUpClassesToAdd.setOnAction(e -> {
			String semester = new SelectTerm().display();
		});
		grid.add(lookUpClassesToAdd, 0, 3);
		lookUpClassesToAdd.setOnAction(e -> new LookUpClassesToAdd().display());
		lookUpClassesToAdd.setMinWidth(250);

		Button buyTextBooksOnline = new Button("Buy Textbooks Online");
		buyTextBooksOnline.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				//openWebpage("https:http://www.bkstr.com/georgiastatestore/home");
				//this try catch works for me if it works for everyone we should leave this in instead of openWebpage
				try {
					openURL("https://www.bkstr.com/georgiastatestore/home");
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		grid.add(buyTextBooksOnline, 0, 4);
		buyTextBooksOnline.setMinWidth(250);

		Button changeVariableHours = new Button("Change Variable Hours");
		grid.add(changeVariableHours, 0, 5);
		changeVariableHours.setMinWidth(250);

		Button viewConciseStudentSchedule = new Button("View Concise Student Schedule");
		grid.add(viewConciseStudentSchedule, 0, 6);
		viewConciseStudentSchedule.setMinWidth(250);

		Button viewWeeklySchedule = new Button("View Weekly Schedule");
		grid.add(viewWeeklySchedule, 0, 7);
		viewWeeklySchedule.setMinWidth(250);

		Button viewBasicCourseInformation = new Button("View Basic Course Information");
		grid.add(viewBasicCourseInformation, 0, 8);
		viewBasicCourseInformation.setMinWidth(250);

		Button registrationAgreement = new Button("Registration Agreement");
		grid.add(registrationAgreement, 0, 9);
		registrationAgreement.setMinWidth(250);

		Button logOut = new Button("Logout");
		grid.add(logOut, 0, 10);
		logOut.setMinWidth(250);

		logOut.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				window.close();
				new Main().start(window);

			}
		});
		
		//Create two separators
		Separator tSep = new Separator();
		Separator bSep = new Separator();
		tSep.setPrefSize(600, 5);
		bSep.setPrefWidth(600);
		
		//Create label for heading
		VBox head = new VBox();
		head.setMinWidth(600);
		head.setMaxWidth(600);
		head.setAlignment(Pos.TOP_CENTER);
		Label menuHead = new Label("Registration Menu");
		menuHead.setPadding(new Insets(0,0,5,0));
		head.getChildren().addAll(menuHead, tSep);
		grid.add(head, 0, 0);
		
		
		
		grid.setPadding(new Insets(0,10,10,10));
		grid.setVgap(10);
		grid.setAlignment(Pos.CENTER_LEFT);
		grid.setMinWidth(600);

		Scene scene = new Scene(grid);
		window.setScene(scene);
		scene.getStylesheets().add("com/gsu/gg/ui/regMenuStyle.css");
		window.setTitle("Registration Menu");
		window.show();
		return window;
	}
=======
	public Stage display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        
        //Buttons
        Button checkRegistrationStatus = new Button("Check Registration Status and Appointment Times");
        checkRegistrationStatus.setOnAction(e -> {
            String option = new SelectTerm().display();
            System.out.println(option);
        });
        grid.add(checkRegistrationStatus,0,0);
        checkRegistrationStatus.setMinWidth(600);
        
        Button addDropWithdrawClasses = new Button("Add/Drop/Withdraw Classes");
        addDropWithdrawClasses.setOnAction(e -> new AddDropWithdrawClasses(user).display());
        grid.add(addDropWithdrawClasses,0,1);
        addDropWithdrawClasses.setMinWidth(600);
        
        Button lookUpClassesToAdd = new Button("Look-Up Classes to Add");
        lookUpClassesToAdd.setOnAction(e -> {
            String semester = new SelectTerm().display();
        });
        grid.add(lookUpClassesToAdd,0,2);
        lookUpClassesToAdd.setOnAction(e -> new LookUpClassesToAdd().display());
        lookUpClassesToAdd.setMinWidth(600);
        
        Button buyTextBooksOnline = new Button("Buy Textbooks Online");
        buyTextBooksOnline.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent ae){
        	openWebpage("https://www.youtube.com/");
        	}
        });
        
        grid.add(buyTextBooksOnline,0,3);
        buyTextBooksOnline.setMinWidth(600);
        
        Button changeVariableHours = new Button("Change Variable Hours");
        grid.add(changeVariableHours,0,4);
        changeVariableHours.setMinWidth(600);
        
        Button viewConciseStudentSchedule = new Button("View Concise Student Schedule");
        grid.add(viewConciseStudentSchedule,0,5);
        viewConciseStudentSchedule.setMinWidth(600);
        
        Button viewWeeklySchedule = new Button("View Weekly Schedule");
        grid.add(viewWeeklySchedule,0,6);
        viewWeeklySchedule.setMinWidth(600);
        
        Button viewBasicCourseInformation = new Button("View Basic Course Information");
        grid.add(viewBasicCourseInformation,0,7);
        viewBasicCourseInformation.setMinWidth(600);
        
        Button registrationAgreement = new Button("Registration Agreement");
        grid.add(registrationAgreement,0,8);
        registrationAgreement.setMinWidth(600);
        
        Button logOut = new Button("Logout");
        grid.add(logOut, 0, 9);
        logOut.setMinWidth(600);
        
        logOut.setOnAction(new EventHandler<ActionEvent>(){
        	public void handle(ActionEvent ae){
        		window.close();
        		new Main().start(new Stage());
        		
        	}
        });
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setMinWidth(600);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.setTitle("Registration Menu");
        window.show();
        return window;
    }
>>>>>>> stash

	public static void openWebpage(String url) {
		try {
			new ProcessBuilder("x-www-browser", url).start();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

		public static void openURL(String url) throws Exception {
			java.awt.Desktop.getDesktop().browse(new URI(url));
		}

}