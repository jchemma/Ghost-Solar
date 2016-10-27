/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author jchemma
 */
public class AddDropWithdrawPage{
    
    public void display() {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date date = new Date();
        Stage window = new Stage();
        //Table
        TableView table = new TableView();
        
        //Columns
        double columnWidth = 67;
        TableColumn statusColumn = new TableColumn("Status");
        statusColumn.setPrefWidth(columnWidth);
        TableColumn actionColumn = new TableColumn("Action");
        actionColumn.setPrefWidth(columnWidth);
        TableColumn crnColumn = new TableColumn("CRN");
        crnColumn.setPrefWidth(columnWidth);
        TableColumn subjectColumn = new TableColumn("Subject");
        subjectColumn.setPrefWidth(columnWidth);
        TableColumn courseColumn = new TableColumn("Course");
        courseColumn.setPrefWidth(columnWidth);
        TableColumn sectionColumn = new TableColumn("Section");
        sectionColumn.setPrefWidth(columnWidth);
        TableColumn daysColumn = new TableColumn("Days");
        daysColumn.setPrefWidth(columnWidth);
        TableColumn timeColumn = new TableColumn("Time");
        timeColumn.setPrefWidth(columnWidth);
        TableColumn levelColumn = new TableColumn("Level");
        levelColumn.setPrefWidth(columnWidth);
        TableColumn creditHoursColumn = new TableColumn("Credit Hours");
        creditHoursColumn.setPrefWidth(columnWidth);
        TableColumn gradeModeColumn = new TableColumn("Grade Mode");
        gradeModeColumn.setPrefWidth(columnWidth);
        TableColumn titleColumn = new TableColumn("Title");
        titleColumn.setPrefWidth(columnWidth);
        
        //add columns to table
        table.getColumns().addAll(statusColumn, actionColumn, crnColumn, 
                subjectColumn, courseColumn, sectionColumn, daysColumn, 
                timeColumn, levelColumn, creditHoursColumn, gradeModeColumn, 
                titleColumn);
        
        //Labels
        //heading
        Label currentScheduleLabel = new Label("Current Schedule");
        currentScheduleLabel.setFont(new Font("Arial", 20));
        
        Label addClassesWorksheetLabel = new Label("Add Classes Worksheet");
        addClassesWorksheetLabel.setFont(new Font("Arial", 20));
        addClassesWorksheetLabel.setPadding(new Insets(30,0,0,0));
        
        //CRN textfields
        TextField crn1 = new TextField();
        TextField crn2 = new TextField();
        TextField crn3 = new TextField();
        TextField crn4 = new TextField();
        TextField crn5 = new TextField();
        TextField crn6 = new TextField();
        TextField crn7 = new TextField();
        TextField crn8 = new TextField();
        
        //crn entry layout
        HBox crnLayout = new HBox();
        crnLayout.getChildren().addAll(crn1, crn2, crn3, crn4, crn5, crn6, crn7, crn8);
        
        //Buttons
        Button submitChanges = new Button("Submit Changes");
        Button classSearch = new Button("Class Search");
        Button reset = new Button("Reset");
        
        //miscallaneous labels
        Label totalCreditHoursLabel = new Label("Total Credit Hours: ");
        Label billingHoursLabel = new Label("Billing Hours: ");
        Label minimumHoursLabel = new Label("Minimum Hours: ");
        Label maximumHoursLabel = new Label("Maximum Hours: ");
        Label currentDateLabel = new Label("Date: ");
        
        //miscellaneous value labels
        Label totalCreditHoursValueLabel = new Label("#");
        Label billingHoursValueLabel = new Label("#");
        Label minimumHoursValueLabel = new Label("#");
        Label maximumHoursValueLabel = new Label("#");
        Label currentDateValueLabel = new Label(dateFormat.format(date));
        
        //miscellaneous layout
        HBox miscellaneousLabelsAndValueLabelLayout = new HBox();
        VBox miscellaneousLabelsLayout = new VBox();
        VBox miscellaneousValueLabelLayout = new VBox();
        
        //labels
        miscellaneousLabelsLayout.getChildren().addAll(totalCreditHoursLabel, 
                billingHoursLabel, minimumHoursLabel, maximumHoursLabel, 
                currentDateLabel);
        
        //values
        miscellaneousValueLabelLayout.getChildren().addAll(
                totalCreditHoursValueLabel, billingHoursValueLabel, 
                minimumHoursValueLabel, maximumHoursValueLabel, 
                currentDateValueLabel);
        
        //labels and values
        miscellaneousLabelsAndValueLabelLayout.getChildren().addAll(
                miscellaneousLabelsLayout, miscellaneousValueLabelLayout);
        
        //layout for buttons
        HBox buttonLayout = new HBox();
        buttonLayout.getChildren().addAll(submitChanges, classSearch, reset);
        
        //layout for entire page
        VBox pageLayout = new VBox();
        pageLayout.getChildren().addAll(currentScheduleLabel, table, 
                miscellaneousLabelsAndValueLabelLayout, 
                addClassesWorksheetLabel, crnLayout, buttonLayout);
        Scene scene = new Scene(pageLayout,804,600);
        
        window.setTitle("Add/Drop/Withdraw");
        window.isAlwaysOnTop();
        window.setScene(scene);
        window.alwaysOnTopProperty();
        window.showAndWait();
    }
}
