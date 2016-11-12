package application;
	
import java.io.IOException;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException, ClassNotFoundException {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/weather_station.fxml"));
		Parent root = (Parent)loader.load();
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		primaryStage.sizeToScene();
		primaryStage.setTitle("Weather station by Bartek & Tomek v.0.2");
		primaryStage.show();
		}
	
	public static void main(String[] args) {
		launch(args);
	}
}