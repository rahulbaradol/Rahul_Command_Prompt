package application;

import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class WelcomeController {
	
	public void TermsAndConditions() {
		
		Stage primaryStage = new Stage();
		
		try {
		    Parent root = FXMLLoader.load(getClass().getResource("/application/TermsAndConditions.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Terms and Conditions");
			primaryStage.setResizable(false);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void OpenCommandPrompt() {

		   Stage primaryStage = new Stage();

			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/CommandPrompt.fxml"));
				Scene s = new Scene(root);
				primaryStage.setScene(s);
				primaryStage.setResizable(false);
				primaryStage.setTitle("Command Prompt");
				primaryStage.show();
			}catch(Exception e) {
				Notifications n = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.hours(1000))
						.position(Pos.CENTER)
						.darkStyle();
				n.showError();
			}
	}
	
}
