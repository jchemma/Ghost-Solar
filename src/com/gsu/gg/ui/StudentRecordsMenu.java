package com.gsu.gg.ui;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class StudentRecordsMenu{
    public Stage display(){
        Stage window = new Stage();
        window.setTitle("Student Records Menu");
        GridPane grid = new GridPane();
        //Button
        Button viewHolds = new Button("View Holds");
        grid.add(viewHolds, 0, 0);
        viewHolds.setMinWidth(600);
        
        Button viewFinalGrades = new Button("View Final Grades");
        grid.add(viewFinalGrades, 0, 1);
        viewFinalGrades.setMinWidth(600);
        
        Button viewTransferCredit = new Button("View Transfer Credit");
        grid.add(viewTransferCredit, 0, 2);
        viewTransferCredit.setMinWidth(600);
        
        Button viewUnofficialAcademicTranscript = new Button("Unofficial Academic Transcript");
        grid.add(viewUnofficialAcademicTranscript, 0, 3);
        viewUnofficialAcademicTranscript.setMinWidth(600);
        
        Button transcriptOrderingSite = new Button("Transcript Ordering Site");
        grid.add(transcriptOrderingSite, 0, 4);
        transcriptOrderingSite.setMinWidth(600);
        
        Button viewStatusOfTranscriptRequest = new Button("View Status Of Transcript Request");
        grid.add(viewStatusOfTranscriptRequest, 0, 5);
        viewStatusOfTranscriptRequest.setMinWidth(600);
        
        Button displayOfficialEnrollmentVerificationCertificate = new Button("Display Official Enrollment Verification Certificate");
        grid.add(displayOfficialEnrollmentVerificationCertificate, 0, 6);
        displayOfficialEnrollmentVerificationCertificate.setMinWidth(600);
        
        Button viewAcademicEvaluation = new Button("View Academic Evaluation");
        grid.add(viewAcademicEvaluation, 0, 7);
        viewAcademicEvaluation.setMinWidth(600);
        
        Button myGradePointAverages = new Button("My Grade Point Averages");
        grid.add(myGradePointAverages, 0, 8);
        myGradePointAverages.setMinWidth(600);
        
        Button myWithdrawlHistory = new Button("My Withdrawl History");
        grid.add(myWithdrawlHistory, 0, 9);
        myWithdrawlHistory.setMinWidth(600);
        
        Button applyToGraduate = new Button("Apply To Graduate");
        grid.add(applyToGraduate, 0, 10);
        applyToGraduate.setMinWidth(600);
        
        Button viewApplicationToGraduate = new Button("View Application To Graduate (If applied online)");
        grid.add(viewApplicationToGraduate, 0, 11);
        viewApplicationToGraduate.setMinWidth(600);
        
        Button myRepeatToReplaceHistory = new Button("My Repeat To Replace History");
        grid.add(myRepeatToReplaceHistory, 0, 12);
        myRepeatToReplaceHistory.setMinWidth(600);
        
        Button viewLawStudentSupplementalInformation = new Button("View Law StudentSupplemental Information");
        grid.add(viewLawStudentSupplementalInformation, 0, 13);
        viewLawStudentSupplementalInformation.setMinWidth(600);
        
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setMinWidth(600);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
        
        return window;
    }
}