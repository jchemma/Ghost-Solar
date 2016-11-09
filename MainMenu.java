
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainMenu extends Application{
    Stage window;
    public static void main(String[]args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Main Menu");
        
        //layout
        GridPane grid = new GridPane();
        
        //Buttons
        Button newStudentOrientationMenu = new Button("New Student Orientation and Math & Chemistry Placement Testing Menu");
        newStudentOrientationMenu.setOnAction(e -> newStudentOrientation());
        grid.add(newStudentOrientationMenu, 0, 0, 2, 1);
        newStudentOrientationMenu.setMinWidth(600);
        
        Button registrationMenu = new Button("Registration Menu");
        registrationMenu.setOnAction(e -> registrationMenu());
        grid.add(registrationMenu, 0, 1,2,1);
        registrationMenu.setMinWidth(600);
        
        Button studentRecordsMenu = new Button("Student Records Menu");
        studentRecordsMenu.setOnAction(e->studentRecordsMenu());
        grid.add(studentRecordsMenu, 0, 2,2,1);
        studentRecordsMenu.setMinWidth(600);
        
        Button studentAccountsMenu = new Button("Student Accounts Menu");
        grid.add(studentAccountsMenu, 0, 3);
        studentAccountsMenu.setMinWidth(600);
        
        Button financialAid = new Button("Financial Aid");
        grid.add(financialAid, 0, 4);
        financialAid.setMinWidth(600);
        
        Button personalInformationMenu = new Button("Personal Information Menu");
        grid.add(personalInformationMenu, 0, 5);
        personalInformationMenu.setMinWidth(600);
        
        Button enterStudentEvaluationOfInstructor = new Button("Enter Student Evaluation of Instructor");
        grid.add(enterStudentEvaluationOfInstructor, 0, 6);
        enterStudentEvaluationOfInstructor.setMinWidth(600);
        
        Button viewAllStudentEvaluationOfInstructor = new Button("View All Student Evaluations of Instructor");
        grid.add(viewAllStudentEvaluationOfInstructor, 0, 7);
        viewAllStudentEvaluationOfInstructor.setMinWidth(600);
        
        Button universityHousingMenu = new Button("University Housing Menu");
        grid.add(universityHousingMenu, 0, 8);
        universityHousingMenu.setMinWidth(600);
        
        Button transferArticulation = new Button("Transfer Articulation");
        grid.add(transferArticulation, 0, 9);
        transferArticulation.setMinWidth(600);
        
        grid.setVgap(10);
        grid.setAlignment(Pos.CENTER);
        grid.setMinWidth(600);
        
        Scene scene = new Scene(grid);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private void registrationMenu(){
        window = new RegistrationMenu().display();
    }
    private void newStudentOrientation(){
        window = new NewStudentRegistration().display();
    }
    private void studentRecordsMenu(){
        window = new StudentRecordsMenu().display();
    }
    
}