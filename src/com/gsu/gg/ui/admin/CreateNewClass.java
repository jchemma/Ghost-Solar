/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gsu.gg.ui.admin;

import com.gsu.gg.manager.RegistrationManager;
import com.gsu.gg.to.Course;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author jchemma
 */
class CreateNewClass {

    void display() {
        Stage window = new Stage();
        window.setTitle("Class Creation");
        
        TextField name = new TextField();
        name.setPromptText("Course Name");
        
        TextField crn = new TextField();
        crn.setPromptText("CRN Number");
        
        TextField subject = new TextField();
        subject.setPromptText("Subject");
        
        TextArea description = new TextArea();
        description.setPromptText("Description...");
        
        TextField courseNumber = new TextField();
        courseNumber.setPromptText("Course Number");
        
        TextField sectionNumber = new TextField();
        sectionNumber.setPromptText("Initial Section Number");
        
        TextField creditHours = new TextField();
        creditHours.setPromptText("Credit Hours");
        
        CheckBox m = new CheckBox("Monday");
        CheckBox t = new CheckBox("Tuesday");
        CheckBox w = new CheckBox("Wednesday");
        CheckBox r = new CheckBox("Thursday");
        CheckBox f = new CheckBox("Friday");
        CheckBox s = new CheckBox("Saturday");
        
        HBox checkBoxLayout = new HBox();
        
        checkBoxLayout.getChildren().addAll(m,t,w,r,f,s);
        
        TextField time = new TextField();
        time.setPromptText("Time Available");
        
        TextField capacity = new TextField();
        capacity.setPromptText("Capacity");
        
        TextField location = new TextField();
        location.setPromptText("Location");
        
        VBox layout = new VBox();
        
        Button createNewClass = new Button("Create New Class");
        createNewClass.setOnAction(e-> {
            int classCRN = Integer.parseInt(crn.getText());
            String className = name.getText();
            int classCreditHours = Integer.parseInt(creditHours.getText());
            String classDescription = description.getText();
            String days = availableDays(m,t,w,r,f,s);
            Course course = new Course(classCRN, className, classCreditHours, classDescription,
            days);
            try {
                RegistrationManager.createCourse(course);
            } catch (Exception ex) {
                Logger.getLogger(CreateNewClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
        
        Button cancel = new Button("Cancel");
        layout.getChildren().addAll(crn, subject, courseNumber, sectionNumber, creditHours,checkBoxLayout, time, capacity, location);
        
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.show();
    }
    
    private String availableDays(CheckBox...args){
        String[] days = {"M","T","W","R","F","S"};
        String day = "";
        int counter = 0;
        for(CheckBox c : args){
            if(c.isSelected()){
                day += days[counter];
                counter++;
            }
        }
        return day;
    }
    
}
