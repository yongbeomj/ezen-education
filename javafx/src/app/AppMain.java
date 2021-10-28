package app;

import javafx.application.Application; // import : javafx

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

	@Override
	public void start(Stage ��������) throws Exception {
		
		Parent parent = FXMLLoader.load( getClass().getResource("app/login.fxml"));
		Scene scene = new Scene(parent);
		
		��������.setScene(scene);
		
		��������.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
