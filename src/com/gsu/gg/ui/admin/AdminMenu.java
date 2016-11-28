package com.gsu.gg.ui.admin;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import com.gsu.gg.to.User;
import com.gsu.gg.ui.Main;

/**
 *
 * @author jchemma
 */
public class AdminMenu {

    User user;

    public AdminMenu(User user) {
        this.user = user;
    }

    public void display() {
		Stage window = new Stage();
		window.setTitle("Admin Menu");
		VBox rootNode = new VBox();
		rootNode.setMinWidth(150);
		rootNode.setMaxWidth(150);
		rootNode.setAlignment(Pos.TOP_CENTER);

		Button createNewUser = new Button("Create New User");
		createNewUser.setOnAction(e -> new CreateUser().display());

		Button createNewClass = new Button("Create New Class");
		createNewClass.setOnAction(e -> new CreateNewClass().display());

		Button createNewSection = new Button("Create New Section");
		createNewSection.setOnAction(e -> new CreateSection().display());

		Button logOut = new Button("LogOut");
		logOut.setOnAction(new EventHandler<ActionEvent>() {
			public void handle(ActionEvent ae) {
				window.close();
				new Main().start(window);
			}
		});

		// Make all the buttons the same size
		createNewUser.setMinWidth(120);
		createNewClass.setMinWidth(120);
		createNewSection.setMinWidth(120);
		logOut.setMinWidth(120);

		// create separator
		Separator tSep = new Separator();

		// Create label for heading
		Label menuHead = new Label("Admin Menu");
		menuHead.setPadding(new Insets(0, 0, 5, 0));
		rootNode.getChildren().addAll(menuHead, tSep, createNewUser, createNewClass, createNewSection, logOut);

		window.setMinHeight(200);

		rootNode.setMinSize(250, 200);
		rootNode.setSpacing(10);

		Scene scene = new Scene(rootNode);
		scene.getStylesheets().add("com/gsu/gg/ui/admin/AdminMenuStyle.css");
		window.setScene(scene);
		window.show();
	}
}
