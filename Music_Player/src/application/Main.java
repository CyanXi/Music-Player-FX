package application;
	
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
import javafx.scene.paint.Color;
import javafx.stage.Stage; 


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		/*Solo es cambiar el archovo que abre el get.Resourse para ver la demás interfaces */
		FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("PáginaPrincipal.fxml"));
		Scene scene;
		try {
			scene = new Scene(fxmlLoader.load(), 600, 400);
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