
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jchemma
 */
public class NewStudentRegistration {
    Stage window;
    public Stage display(){
        Stage window = new Stage();
        GridPane grid = new GridPane();
        
        //Buttons
        Button registerForNewStudentOrientation = new Button("Register for New Student Orientation");
        grid.add(registerForNewStudentOrientation,0,0);
        registerForNewStudentOrientation.setMinWidth(600);
        
        Button mathPlacementTesting = new Button("Math Placement Testing");
        grid.add(mathPlacementTesting, 0, 1);
        mathPlacementTesting.setMinWidth(600);
        
        Button chemistryPlacementTesting = new Button("Chemistry Placement Testing");
        grid.add(chemistryPlacementTesting, 0, 2);
        chemistryPlacementTesting.setMinWidth(600);
        
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setMinWidth(600);
        
        window.setTitle("Math and Chemistry Placement Testing & New Student Orientation Menu");
        Scene scene = new Scene(grid);
        window.setScene(scene);
        window.show();
        return window;
    }
}
