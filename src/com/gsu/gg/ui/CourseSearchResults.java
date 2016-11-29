package com.gsu.gg.ui;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import com.gsu.gg.to.Course;
import com.gsu.gg.to.CourseSearch;
import com.gsu.gg.to.CourseSection;
import com.gsu.gg.to.CourseSearch;
import com.gsu.gg.to.User;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.gsu.gg.dao.RegistrationDAO;
import com.gsu.gg.manager.RegistrationManager;

public class CourseSearchResults {

	Label response;
	CourseSearch search;
	//Create Observable list of items to populate list.
			ObservableList<Course> lookUpRes =FXCollections.observableArrayList();

	//public void display() {
	public void display(){

		 try {
             List<Course> courseList = RegistrationManager.getSearchCourses(search);
             lookUpRes.addAll(courseList);
         } catch (Exception ex) {
             Logger.getLogger(AddDropWithdrawClasses.class.getName()).log(Level.SEVERE, null, ex);
         }
		//Create a stage.
		Stage lookResults = new Stage();

		//Set stage title.
		lookResults.setTitle("Look-UP Classes to Add");

		//Create root Node as BorderPane.
		BorderPane rootNode = new BorderPane();

		//create scene.
		Scene myScene = new Scene(rootNode, 800, 600);
		//set Scene to Stage.
		lookResults.setScene(myScene);
		lookResults.setMinHeight(680);
		lookResults.setMaxHeight(680);
		lookResults.setMinWidth(750);
		lookResults.setMaxWidth(750);



		//Create TableView of CourseSearch
		TableView<Course> cSec = new TableView<Course>(lookUpRes);

		//Add Headings and Specify cell Factories.
		TableColumn<Course, String> crn =
				new TableColumn<>("CRN");
		crn.setCellValueFactory(new PropertyValueFactory<>("crn"));
		cSec.getColumns().add(crn);

		TableColumn<Course, String> name =
				new TableColumn<>("Name");
		name.setCellValueFactory(new PropertyValueFactory<>("name"));
		cSec.getColumns().add(name);

		TableColumn<Course, String> creditHours =
				new TableColumn<>("Credit Hours");
		creditHours.setCellValueFactory(new PropertyValueFactory<>("creditHours"));
		cSec.getColumns().add(creditHours);

		cSec.setItems(lookUpRes);

		//Size the table.
		cSec.setPrefSize(360, 196);

		//Get the TableView selection model.
		TableView.TableViewSelectionModel<Course> secSelModel = cSec.getSelectionModel();

		//Use a change listener to respond to a change of selection within the table view.
		secSelModel.selectedIndexProperty().addListener(new ChangeListener<Number>(){
			public void changed(ObservableValue<? extends Number> changed,
					Number oldVal, Number newVal){
				//Display the index of the selction.
				response.setText("Selected row is " + newVal);
			}
		});

		VBox tRes = new VBox();
		tRes.getChildren().addAll(cSec, response);

		//Add controls to the scene graph.
		rootNode.setCenter(tRes);
		//show the stage and its scene.
		lookResults.show();

	}
}
