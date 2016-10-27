
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DepartmentClassCreationPage{
    
    public void display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(10,10,10,10));
        
        //Labels
        Label crnLabel = new Label("CRN: ");
        grid.add(crnLabel,1,0);
        
        Label courseLabel = new Label("Course: ");
        grid.add(courseLabel,1,1);
        
        Label titleLabel = new Label("Title: ");
        grid.add(titleLabel,1,2);
        
        Label creditHoursLabel = new Label("Credit Hours: ");
        grid.add(creditHoursLabel,1,3);
        
        Label startDateLabel = new Label("Start Date: ");
        grid.add(startDateLabel,1,4);
        
        Label endDateLabel = new Label("End Date: ");
        grid.add(endDateLabel,1,5);
        
        Label daysLabel = new Label("Days: ");
        grid.add(daysLabel,1,6);
        
        Label timeLabel = new Label("Time: ");
        grid.add(timeLabel,1,7);
        
        Label locationLabel = new Label("Location: ");
        grid.add(locationLabel,1,8);
        
        Label instructorLabel = new Label("Instructor: ");
        grid.add(instructorLabel,1,9);
        
        //text fields
        TextField crnTextField = new TextField();
        grid.add(crnTextField,2,0);
        
        TextField courseTextField = new TextField();
        grid.add(courseTextField,2,1);
        
        TextField titleTextField = new TextField();
        grid.add(titleTextField,2,2);
        
        TextField creditHoursTextField = new TextField();
        grid.add(creditHoursTextField,2,3);
        
        TextField startDateTextField = new TextField();
        grid.add(startDateTextField,2,4);
        
        TextField endDateTextField = new TextField();
        grid.add(endDateTextField,2,5);
        
        TextField daysTextField = new TextField();
        grid.add(daysTextField,2,6);
        
        TextField timeTextField = new TextField();
        grid.add(timeTextField,2,7);
        
        TextField locationTextField = new TextField();
        grid.add(locationTextField,2,8);
        
        TextField instructorTextField = new TextField();
        grid.add(instructorTextField,2,9);
        
        //buttons
        Button submitButton = new Button("Submit");
        grid.add(submitButton,1,10);
        
        Button cancelButton = new Button("Cancel");
        grid.add(cancelButton,2,10);
        
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.setTitle("Class Creation Page");
        window.show();
    }
}