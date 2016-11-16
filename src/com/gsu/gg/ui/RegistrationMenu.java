package com.gsu.gg.ui;
import java.io.IOException;

import com.gsu.gg.to.User;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class RegistrationMenu {
	
	User user;
	
	public RegistrationMenu(User user){
		this.user = user;
	}
	
    Stage window;
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
        lookUpClassesToAdd.setMinWidth(600);
        
        Button buyTextBooksOnline = new Button("Buy Textbooks Online");
        buyTextBooksOnline.setOnAction(e -> openWebpage("http://www.bkstr.com/georgiastatestore/home"));
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
        
        Button viewBasicCourseInformation = new Button("View Bassic Course Information");
        grid.add(viewBasicCourseInformation,0,7);
        viewBasicCourseInformation.setMinWidth(600);
        
        Button registrationAgreement = new Button("Registration Agreement");
        grid.add(registrationAgreement,0,8);
        registrationAgreement.setMinWidth(600);
        
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setMinWidth(600);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.setTitle("Registration Menu");
        window.show();
        return window;
    }
    
    public static void openWebpage(String url) {
    try {
        new ProcessBuilder("x-www-browser", url).start();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}