package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	
	@Override
	public void start(Stage stage) throws IOException {
		Parent root=FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
		Scene scene= new Scene(root);
		
		stage.setScene(scene);
		
		stage.setResizable(false);
		stage.setTitle("Number Guessing Game");
		
		Image image= new Image("/icon.png");
		stage.getIcons().add(image);
		
		stage.show();
	}
	
	public static void main(String[] args) {
		
		launch(args);
	}
}
