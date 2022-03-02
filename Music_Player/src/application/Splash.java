package application;
	
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene; 
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage; 
import javafx.scene.layout.HBox;

/* EL archivo no me corre a menos que lo renombre a Main y lo corra como tal, no me queda muy claro por qué */

public class Splash extends Application {
	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {

		try {
			FileInputStream input = new FileInputStream("C:\\Universidad (tareas)\\Music_Player\\src\\application\\Splash-07.png");
			Image img = new Image(input);
			ImageView imgView = new ImageView(img);
			imgView.setFitWidth(600);
		    imgView.setPreserveRatio(true);
			
			StackPane layout = new StackPane(imgView);
			Scene scene = new Scene(layout, 600, 400);
			primaryStage.setTitle("Music Player");
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}