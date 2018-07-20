package application;

import com.jfoenix.controls.JFXTextArea;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

import java.io.IOException;

public class CommandPromptMainController {
	
	private int mistakes_done = 0;
	
	private int NotFilledMainCommandInTextField = 0;
	
	private int Timesentered = 0;
	private int Timesexited = 0;
	private int TimesenteredTextArea = 0;
	private int TimesexitedTextArea = 0;
	private int TimesClickedDoneButton = 0;
	private int TimesClickedClearButton = 0;
	private int TimesClickedExitButton = 0;
	private int TimesClickedTextArea = 0;
	private int TimesTypedInTheTextArea = 0;

	@FXML
	private AnchorPane CommandPromptScreen;

	@FXML
	private Label md;

	@FXML
	public JFXTextArea commandLog;

	@FXML
	public JFXTextArea tfc;

	private int numberOfTimesAskedHelp = 0;

	public void Help() {
		Notifications n = Notifications.create()
				.title("Help")
				.text("This application is made because to interact with the computer. You can ask questions or give commands like, open calculater, etc., "
						+ "and other lot many things you can do. This Command Prompt is developed or created by Rahul Baradol")
				.graphic(null)
				.hideAfter(Duration.seconds(20))
				.position(Pos.CENTER)
				.darkStyle();
		n.showInformation();

		numberOfTimesAskedHelp++;

		if(numberOfTimesAskedHelp == 20) {
			Notifications nNumberOfAskedHelp = Notifications.create()
					.title("A Message from Command Prompt")
					.text("Hey User, you have asked 20 times help! I don't have any problem, but, what's there in asking 20 times help!! Are you kidding?!")
					.graphic(null)
					.hideAfter(Duration.hours(10))
					.position(Pos.CENTER)
					.darkStyle();
			nNumberOfAskedHelp.showInformation();
		}
	}
	
	
	public void Exit() {
		Notifications nc = Notifications.create()
				.title("Command Prompt - Exit")
				.text("If you want to exit then click on the notification, if no then click on close")
				.graphic(null)
				.hideAfter(Duration.hours(1000))
				.position(Pos.CENTER)
				.darkStyle()
				.onAction(arg0 -> System.exit(0));
		nc.showConfirm();

		commandLog.setText("Input Occupied. _Exit");
	}
	
	public void Clear() {
		Notifications nc = Notifications.create()
				.title("Command Prompt - Clear the Text Area")
				.text("If you want to clear the textfield then click on the notification, if no then click on close")
				.graphic(null)
				.hideAfter(Duration.hours(1000))
				.position(Pos.CENTER)
				.darkStyle()
				.onAction((actionEvent) -> {
						tfc.setText("Command:");
				});

		nc.showConfirm();

		commandLog.setText("Input Occupied. _Clear the Command Line");
	}

	public void StartQuestionPrompt() {
		Notifications nConfirmStartQuestionPrompt = Notifications.create()
				.title("Are you sure?")
				.text("Are you sure that you want to enter Question Prompt Mode? If yes then click on the notification, if no then click on the close button")
				.graphic(null)
				.hideAfter(Duration.hours(10000))
				.position(Pos.CENTER)
				.darkStyle()
				.onAction((actionEvent) -> {
					try {
						Parent QuestionPrompt = FXMLLoader.load(getClass().getResource("/application/QuestionAsking.fxml"));
						CommandPromptScreen.getChildren().setAll(QuestionPrompt);
					} catch (IOException e) {
						Notifications nc = Notifications.create()
								.title("Error")
								.text("Could not find the file.")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						nc.showError();
					}
				});

		nConfirmStartQuestionPrompt.showConfirm();
	}

	public void Command() {
		
		String t = tfc.getText();
		
		if(t.equals("Command: Help")) {
			Notifications n = Notifications.create()
					.title("Help")
					.text("This application is made because to interact with the computer. You can ask questions or give commands like, open calculater, etc., "
							 + "and other lot many things you can do. This Command Prompt is developed or created by Rahul Baradol")
					.graphic(null)
					.hideAfter(Duration.seconds(20))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();

			commandLog.setText("Input Occupied. _Help");

		}else if(t.equals("Command: Hello")) {
			Notifications n = Notifications.create()
					.title("Command Prompt")
					.text("Hello")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();

			commandLog.setText("Input Occupied. _Hello");

		}else if(t.equals("Command: Function_Addition")) {

			Stage primaryStage = new Stage();
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/FunctionAdder.fxml"));
			    Scene scene = new Scene(root);
			    primaryStage.setResizable(false);
			    primaryStage.setScene(scene);
			    primaryStage.setTitle("Function Adder");
			    primaryStage.show();
			} catch (IOException e) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Function Addition");

		}else if(t.equals("Command: Function_Subtract")) {
			Stage primaryStage = new Stage();
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/FunctionSubtract.fxml"));
			    Scene scene = new Scene(root);
			    primaryStage.setResizable(false);
			    primaryStage.setScene(scene);
			    primaryStage.setTitle("Function Subtracter");
			    primaryStage.show();
			} catch (IOException e) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Function Subtract");

		}else if(t.equals("Command: Function_Multiply")) {
			Stage primaryStage = new Stage();
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/FunctionMultiply.fxml"));
			    Scene scene = new Scene(root);
			    primaryStage.setResizable(false);
			    primaryStage.setScene(scene);
			    primaryStage.setTitle("Function Mutiplier");
			    primaryStage.show();
			} catch (IOException e) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Function Multiply");

		}else if(t.equals("Command: Function_Division")) {
			Stage primaryStage = new Stage();
			
			try {
				Parent root = FXMLLoader.load(getClass().getResource("/application/FunctionDivision.fxml"));
			    Scene scene = new Scene(root);
			    primaryStage.setResizable(false);
			    primaryStage.setScene(scene);
			    primaryStage.setTitle("Function Divider");
			    primaryStage.show();
			} catch (IOException e) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Function Division");

		}else if(t.equals("Command: Open_Calculater")) {
			Stage primaryStage = new Stage();
			
			try {
			    Parent root = FXMLLoader.load(getClass().getResource("/application/Calculater.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("Command Prompt - Calculater");
				primaryStage.setResizable(false);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}

			commandLog.setText("Input Occupied. _Open_Calculater");

		}else if(t.equals("Command: Who are you?") || t.equals("Command: Who are you")) {
			Notifications n = Notifications.create()
					.title("Command Prompt")
					.text("I am Command Prompt. I am a software built by Rahul Baradol. I am useful for doing some operations and calculations and some tasks that have been asigned.")
					.graphic(null)
					.hideAfter(Duration.seconds(17))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();

			commandLog.setText("Input Occupied. _Question_Who are you?");

		}else if(t.equals("Command: Do you want pizza?") || t.equals("Command: Do you want pizza") || t.equals("Command: Do you want Pizza") || t.equals("Command: Do you want Pizza?")) {
			Notifications np = Notifications.create()
					.title("Command Prompt")
					.text("With extra sauce, no cheese")
					.graphic(null)
					.hideAfter(Duration.seconds(10))
					.position(Pos.CENTER)
					.darkStyle();
			np.show();

			commandLog.setText("Input Occupied. _Question_Do you want pizza?");

		}else if(t.equals("Command: Open_Perimeter.Find")) {
			Stage primaryStage = new Stage();
			
			try {
			    Parent root = FXMLLoader.load(getClass().getResource("/application/FunctionPerimeterFinder.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("Perimter Finder");
				primaryStage.setResizable(false);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}

			commandLog.setText("Input Occupied. _Open_Perimeter Finder ");

		}else if(t.equals("Command: List_CommandPrompt:Functions")) {
			
			Stage primaryStage = new Stage();
			
			try {
			     Parent root = FXMLLoader.load(getClass().getResource("/application/ListOfAllItems.fxml"));
			     Scene scene = new Scene(root);
		         primaryStage.setScene(scene);
		         primaryStage.setTitle("List of Items that are avalialble in Command Prompt external devices");
		         primaryStage.setResizable(false);
		         primaryStage.show();
			}catch(Exception e) {
				Notifications nerror = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				nerror.show();
			}

			commandLog.setText("Input Occupied. _List_CommandPrompt:Functions");

		}else if(t.equals("Command: NoOfTimes_Entered:CommandPrompt:Area")) {
			
			String CTimesentered = Integer.toString(Timesentered);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesentered + " time(s) you entered the Command Prompt area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Entered the Command Prompt_ Area");

		}else if(t.equals("Command: NoOfTimes_Exited:CommandPrompt:Area"))  {
			
			String CTimesexited = Integer.toString(Timesexited);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesexited + " time(s) you exited the Command Prompt area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Exited the Command Prompt_ Area");

		}else if(t.equals("Command: NoOfTimes_Entered:TextArea:Area")) {
			
			String CTimesenteredTextArea = Integer.toString(TimesenteredTextArea);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesenteredTextArea + " time(s) you entered the Text area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Entered the Command Line_ Area");

		}else if(t.equals("Command: NoOfTimes_Exited:TextArea:Area")) {
			
			String CTimesexitedTextArea = Integer.toString(TimesexitedTextArea);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesexitedTextArea + " time(s) you exited the Text area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Exited the Command Line_ Area");

		}else if(t.equals("Command: NoOfTimes_Clicked:DoneButton")) {
			
			String CTimesClickedDoneButton = Integer.toString(TimesClickedDoneButton);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesClickedDoneButton + " time(s) you clicked the Done button")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Clicked the Done Button");

		}else if(t.equals("Command: NoOfTimes_Clicked:ClearButton")) {
			
			String CTimesClickedClearButton = Integer.toString(TimesClickedClearButton);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesClickedClearButton + " time(s) you clicked the Clear button")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Clicked the Clear Button");

		}else if(t.equals("Command: NoOfTimes_Clicked:ExitButton")) {
			
			String CTimesClickedExitButton = Integer.toString(TimesClickedExitButton);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesClickedExitButton + " time(s) you clicked the Exit button")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Clicked the Exit Button");

		}else if(t.equals("Command: NoOfTimes_Clicked:TextArea:Area")) {
			
			String CTimesClickedTextArea = Integer.toString(TimesClickedTextArea);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesClickedTextArea + " time(s) you clicked the Text area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Clicked the Command Line_ Area");

		}else if(t.equals("Command: NoOfTimes_Typed:TextArea:Area")) {
			
			String CTimesTypedInTheTextArea = Integer.toString(TimesTypedInTheTextArea);
			
			Notifications ns = Notifications.create()
					.title("Command Prompt")
					.text(CTimesTypedInTheTextArea + " time(s) you typed in the Text area")
					.graphic(null)
					.hideAfter(Duration.hours(1))
					.position(Pos.CENTER)
					.darkStyle();
			ns.show();

			commandLog.setText("Input Occupied. _Number of Times: Typed the Command Line_ Area");

		}else if(t.equals("Command: _Extra:Rules")) {
			
			Stage stage = new Stage();
			
			try {
			     Parent root = FXMLLoader.load(getClass().getResource("/application/ExtraRules.fxml"));
			     Scene scene = new Scene(root);
			     stage.setScene(scene);
			     stage.setTitle("Extra Rules");
			     stage.setResizable(false);
			     stage.show();
		    }catch (IOException e) {
			     Notifications ncnf = Notifications.create()
			    		 .title("Error")
			    		 .text("Could not find the file")
			    		 .graphic(null)
			    		 .hideAfter(Duration.seconds(10))
			    		 .position(Pos.CENTER)
			    		 .darkStyle();
			     ncnf.showError();
			}

			commandLog.setText("Input Occupied. _Want: Extra Rules of Command Prompt");

		}else if(t.equals("Command: Restart:CommandPrompt") || t.equals("Command: Restart: CommandPrompt") || t.equals("Command : Restart :CommandPrompt") || t.equals("Command: Restart : CommandPrompt")) {
			
			Stage primaryStage = new Stage();
			
			try {
			    Parent root = FXMLLoader.load(getClass().getResource("/application/CommandPrompt.fxml"));
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setScene(scene);
				primaryStage.setTitle("Command Prompt");
				primaryStage.setResizable(false);
				primaryStage.show();
			} catch(Exception e) {
				e.printStackTrace();
			}

			commandLog.setText("Input Occupied. Task_Restart_Command Prompt");

		}else if(t.equals("Command: Open_Folder/File.Maker") || t.equals("Command: Open_File/Folder.Maker")) {
			
			Stage s = new Stage();
			
			try {
			    Parent root = FXMLLoader.load(getClass().getResource("/application/FolderAndFileMaker.fxml"));
			    Scene sc = new Scene(root);
			    s.setScene(sc);
			    s.setTitle("Folder and File Maker");
			    s.setResizable(false);
			    s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(10))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open_Folder or File Maker");

		}else if(t.equals("Command: Open_Tables.Learn")) {
			
			Stage s = new Stage();
			
			try {
			    Parent parent = FXMLLoader.load(getClass().getResource("/application/TableLearning.fxml"));
			    Scene sc = new Scene(parent);
			    s.setScene(sc);
			    s.setTitle("Tables Learning");
			    s.setResizable(false);
			    s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open_Tables Learning");

		}else if(t.equals("")) {
			if(NotFilledMainCommandInTextField < 4) {
				Notifications ntc = Notifications.create()
						.title("Note")
						.text("Type the main starting code in the command prompt textfield. Type 'Command: ' and then type the command code which you want.")
						.graphic(null)
						.hideAfter(Duration.seconds(16))
						.position(Pos.CENTER)
						.darkStyle();
				ntc.showWarning();
			}

			if(NotFilledMainCommandInTextField >= 4) {
				Notifications ntcfill = Notifications.create()
						.title("Note")
						.text("You are not filling the textfield with main command. The text 'Command: ' must be there if you want to "
								+ "give a command. Click on the notification to autofill the textfield by 'Command: '")
						.graphic(null)
						.hideAfter(Duration.seconds(16))
						.position(Pos.CENTER)
						.darkStyle()
						.onAction(new EventHandler<ActionEvent>() {

							@Override
							public void handle(ActionEvent arg0) {
								tfc.setText("Command: ");
							}
							
						});
				
				ntcfill.showWarning();
				
			}
			
			NotFilledMainCommandInTextField++;

			commandLog.setText("Input Occupied. _Blank_ No Main Command Function -> 'Command: '");

		}else if(t.equals("Command: Open_Unit:Converter") || t.equals("Command: Open_Unit: Converter") || t.equals("Command: Open_Unit :Converter") || t.equals("Command: Open_Unit : Converter")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/UnitConverter.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Unit Converter");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Unit Converter");

		}else if(t.equals("Command: Open_Currency:Converter") || t.equals("Command: Open_Currency: Converter") || t.equals("Command: Open_Currency :Converter") || t.equals("Command: Open_Currency : Converter")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/CurrencyConverter.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Currency Converter");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Currency Converter");

		}else if(t.equals("Command: Open_Square:Finder") || t.equals("Command: Open_Square: Finder") || t.equals("Command: Open_Square :Finder") || t.equals("Command: Open_Square : Finder")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/SquareFinder.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Square Finder");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Square Finder");

		}else if(t.equals("Command: Open_Cube:Finder") || t.equals("Command: Open_Cube: Finder")  || t.equals("Command: Open_Cube :Finder") || t.equals("Command: Open_Cube : Finder")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/CubeFinder.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Cube Finder");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Cube Finder");

		}else if(t.equals("Command: Open_Power:Finder") || t.equals("Command: Open_Power: Finder") || t.equals("Command: Open_Power :Finder") || t.equals("Command: Open_Power : Finder")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/PowerFinder.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Power Finder");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Power Finder");

		}else if(t.equals("Command: Start_Question:Mode") || t.equals("Command: Start_Question: Mode") || t.equals("Command: Start_Question :Mode") || t.equals("Command: Start_Question : Mode")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/QuestionAsking.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Question Prompt");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Question Prompt");

		}else if(t.equals("Command: Open_SquareRoot:Finder") || t.equals("Command: Open_SquareRoot: Finder") || t.equals("Command: Open_SquareRoot :Finder")  || t.equals("Command: Open_SquareRoot : Finder")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/SquareRootFinder.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Square Root Finder");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Square Root Finder");

		}else if(t.equals("Command: Open_CubeRoot:Finder") || t.equals("Command: Open_CubeRoot: Finder") || t.equals("Command: Open_CubeRoot :Finder") || t.equals("Command: Open_CubeRoot : Finder")) {

			Stage s = new Stage();

			try {
				Parent parent = FXMLLoader.load(getClass().getResource("/application/CubeRootFinder.fxml"));
				Scene sc = new Scene(parent);
				s.setScene(sc);
				s.setTitle("Cube Root Finder");
				s.setResizable(false);
				s.show();
			}catch(IOException ioe) {
				Notifications ne = Notifications.create()
						.title("Error")
						.text("Could not find the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.showError();
			}

			commandLog.setText("Input Occupied. _Open Cube Root Finder");

		}else {
			Notifications n = Notifications.create()
					.title("Command Prompt")
					.text("'" + t + "'" + " is not defined")
					.graphic(null)
					.hideAfter(Duration.seconds(10))
					.position(Pos.CENTER)
					.darkStyle();
			n.showWarning();

			mistakes_done++;

			if (mistakes_done == 10) {
				Notifications nm = Notifications.create()
						.title("Command Prompt")
						.text("Dear User, you have entered 10 wrong commands. So, if you entered again 2 more wrong commands, the Command Prompt will shut down. So be careful")
						.graphic(null)
						.hideAfter(Duration.seconds(17))
						.position(Pos.CENTER)
						.darkStyle();
				nm.show();
			}

			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					try {
						Thread.sleep(10000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}

					System.exit(0);
				}

			});

			if (mistakes_done == 12) {
				Notifications nm = Notifications.create()
						.title("Command Prompt")
						.text("Dear User, you have entered 12 wrong commands. So, Command Prompt will shut down in 10 seconds")
						.graphic(null)
						.hideAfter(Duration.hours(100000))
						.position(Pos.CENTER)
						.darkStyle();
				nm.show();

				thread.start();
			}

			commandLog.setText("Invalid Command.");
		}
}
	
	public void mouseEntered() {
		md.setText("Mouse entered the Command Prompt area.");
		Timesentered++;
	}
	
	public void mouseExited() {
		md.setText("Mouse exited the Command Prompt area.");
		Timesexited++;
	}
	
	public void mouseClickedDoneButton() {
		md.setText("You clicked on Done Button.");
		TimesClickedDoneButton++;
	}
	
	public void mouseClickedClearButton() {
		md.setText("You clicked on Clear Button.");
		TimesClickedClearButton++;
	}
	
	public void mouseEnteredTextArea() {
		md.setText("You entered the Text Area.");
		TimesenteredTextArea++;
	}
	
	public void mouseExitedTextArea() {
		md.setText("You exited the Text Area.");
		TimesexitedTextArea++;
	}
	
	public void mouseClickedTextArea() {
		md.setText("You clicked on the Text Area.");
		TimesClickedTextArea++;
	}
	
	public void mouseTypingTextArea() {
		md.setText("You are typing in the Text Area.");
		TimesTypedInTheTextArea++;

		commandLog.setText("Getting Input.........");
	}
	
	public void mouseClickedExitButton() {
		md.setText("You clicked on Exit button.");
		TimesClickedExitButton++;
	}

}