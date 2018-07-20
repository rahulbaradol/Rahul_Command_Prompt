package application;

import javafx.scene.control.Label;
import org.controlsfx.control.Notifications;
import com.jfoenix.controls.JFXButton;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TermsAndConditionsMainController {

	@FXML
	protected JFXButton a;
	
	@FXML
	protected JFXButton na;

	@FXML
	protected Label AorNCheck;

	private  File folder = new File("C:/RahulCommandPrompt_Condition");
	private File file = new File("C:/RahulCommandPrompt_Condition/RahulCommandPrompt_Condition.txt");

	String AOrNot;

	public void IAgree() {

		Notifications n = Notifications.create()
				.title("Terms and Conditions - Agree")
				.text("Thank you for agreeing the conditions")
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		n.show();

		a.setVisible(false);
		na.setVisible(false);

		AOrNot = "   You agreed the conditions";
		AorNCheck.setText(AOrNot);

		if(AOrNot.equals("   You agreed the conditions")) {
			if(!folder.exists()) {
				folder.mkdir();

				if(!file.exists()) {
					try {
						PrintWriter printWriter = new PrintWriter(file);
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("         You agreed the conditions");
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("");
						printWriter.println("Please don't delete this file and the folder from your directory or disk");
						printWriter.close();
					} catch (FileNotFoundException e) {
						Notifications notificationFileNotFound = Notifications.create()
								.title("Error")
								.text("Could not find the file")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						notificationFileNotFound.showError();
					}
				}else if(file.exists()) {
					Notifications notificationFileExists = Notifications.create()
							.title("Warning")
							.text("You have dealed with the conditions. You cannot do anything.")
							.graphic(null)
							.hideAfter(Duration.seconds(10))
							.position(Pos.CENTER)
							.darkStyle();
					notificationFileExists.showWarning();

					a.setDisable(true);
					na.setDisable(true);
				}

			}else if(folder.exists()) {
				if(!file.exists()) {
					try {
						PrintWriter printWriter = new PrintWriter(file);
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("         You agreed the conditions");
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("");
						printWriter.println("Please don't delete this file and the folder from your directory or disk");
						printWriter.close();
					} catch (FileNotFoundException e) {
						Notifications notificationFileNotFound = Notifications.create()
								.title("Error")
								.text("Could not find the file")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						notificationFileNotFound.showError();
					}
				}else if(file.exists()) {
					Notifications notificationFileExists = Notifications.create()
							.title("Warning")
							.text("You have dealed with the conditions. You cannot do anything.")
							.graphic(null)
							.hideAfter(Duration.seconds(10))
							.position(Pos.CENTER)
							.darkStyle();
					notificationFileExists.showWarning();

					a.setDisable(true);
					na.setDisable(true);
				}
			}

		}
	}
	
	public void IdonotAgree() {
		Notifications n = Notifications.create()
				.title("Terms and Conditions - Not Agree")
				.text("Never mind as you wish")
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		n.show();
		
		a.setVisible(false);
		na.setVisible(false);

		AOrNot = "You did not agree the conditions";
		AorNCheck.setText(AOrNot);

		if(AOrNot.equals("You did not agree the conditions")) {
			if(!folder.exists()) {
				folder.mkdir();

				if(!file.exists()) {
					try {
						PrintWriter printWriter = new PrintWriter(file);
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("         You did not agreed the conditions");
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("");
						printWriter.println("Please don't delete this file and the folder from your directory or disk");
						printWriter.close();
					} catch (FileNotFoundException e) {
						Notifications notificationFileNotFound = Notifications.create()
								.title("Error")
								.text("Could not find the file")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						notificationFileNotFound.showError();
					}
				}else if(file.exists()) {
					Notifications notificationFileExists = Notifications.create()
							.title("Warning")
							.text("You have dealed with the conditions. You cannot do anything.")
							.graphic(null)
							.hideAfter(Duration.seconds(10))
							.position(Pos.CENTER)
							.darkStyle();
					notificationFileExists.showWarning();

					a.setDisable(true);
					na.setDisable(true);
				}

			}/* !folder if statement ends here */else if(folder.exists()) {
				if(!file.exists()) {
					try {
						PrintWriter printWriter = new PrintWriter(file);
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("         You did not agreed the conditions");
						printWriter.println("/* Rahul Command Prompt /*");
						printWriter.println("");
						printWriter.println("Please don't delete this file and the folder from your directory or disk");
						printWriter.close();
						printWriter.close();
					} catch (FileNotFoundException e) {
						Notifications notificationFileNotFound = Notifications.create()
								.title("Error")
								.text("Could not find the file")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						notificationFileNotFound.showError();
					}
				}else if(file.exists()) {
					Notifications notificationFileExists = Notifications.create()
							.title("Warning")
							.text("You have dealed with the conditions. You cannot do anything.")
							.graphic(null)
							.hideAfter(Duration.seconds(10))
							.position(Pos.CENTER)
							.darkStyle();
					notificationFileExists.showWarning();

					a.setDisable(true);
					na.setDisable(true);
				}
			} // folder if statement ends

		} // A N if statement ends here

	}
	
}