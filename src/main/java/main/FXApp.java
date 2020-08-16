package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FXApp extends Application{

	public static int counter = 1;
	
	public static void main(String[] args) {
		launch();

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		VBox box = FXMLLoader.load(getClass().getResource("/like-template.fxml"));
	
		Scene scene = new Scene(box);
		
		primaryStage.setScene(scene);
		primaryStage.show();
		
		
	}
	

}
