package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		File folder = new File("C:\\RahulCommandPrompt_Condition");
		File file = new File("C:\\RahulCommandPrompt_Condition\\Visited.txt");

		if(folder.exists()) {
			if(!file.exists()) {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
					Scene scene = new Scene(root);
					primaryStage.setScene(scene);
					primaryStage.setTitle("Welcome to Rahul's Command Prompt");
					primaryStage.setResizable(false);
					primaryStage.show();
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					PrintWriter pw = new PrintWriter(file);
					pw.println("/* Rahul Command Prompt /*");
					pw.println("      Visited");
					pw.println("/* Rahul Command Prompt /*");
					pw.println("");
					pw.println("Please don't delete this file from your directory or disk.");
					pw.close();
				} catch (FileNotFoundException e) {
					Notifications n = Notifications.create()
							.title("Error")
							.text("Could not find the file.")
							.graphic(null)
							.hideAfter(Duration.seconds(6))
							.position(Pos.CENTER)
							.darkStyle();
					n.showError();
				}
			}else if(file.exists()) {
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
			} // if file statement ends here
		}else if(!folder.exists()) {  // if first folder statement ends here
			folder.mkdir();

			if(!file.exists()) {
				try {
					Parent root = FXMLLoader.load(getClass().getResource("/application/Welcome.fxml"));
					Scene scene = new Scene(root);
					primaryStage.setScene(scene);
					primaryStage.setTitle("Welcome to Rahul's Command Prompt");
					primaryStage.setResizable(false);
					primaryStage.show();
				} catch (Exception e) {
					e.printStackTrace();
				}

				try {
					PrintWriter pw = new PrintWriter(file);
					pw.println("/* Rahul Command Prompt /*");
					pw.println("      Visited");
					pw.println("/* Rahul Command Prompt /*");
					pw.println("");
					pw.println("Please don't delete this file from your directory or disk.");
					pw.close();
				} catch (FileNotFoundException e) {
					Notifications n = Notifications.create()
							.title("Error")
							.text("Could not find the file.")
							.graphic(null)
							.hideAfter(Duration.seconds(6))
							.position(Pos.CENTER)
							.darkStyle();
					n.showError();
				}
			}else if(file.exists()) {
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
		} // if second folder statement ends here

	}

	public static void main(String[] main) {
		launch(main);
	}

}