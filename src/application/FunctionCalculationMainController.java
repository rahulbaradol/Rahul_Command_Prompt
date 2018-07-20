package application;

import org.controlsfx.control.Notifications;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class FunctionCalculationMainController {

	@FXML
	private JFXTextField tf1;
	
	@FXML
	private JFXTextField tf2;
	
	@FXML
	private Label output;
	
	public void Add() {
		try {
		double ctf1 = Double.parseDouble(tf1.getText());
		double ctf2 = Double.parseDouble(tf2.getText());
		double answer = ctf1 + ctf2;
		output.setText(Double.toString(answer));
	  }catch(Exception e) {
		  Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a number")
					.graphic(null)
					.hideAfter(Duration.seconds(10))
					.position(Pos.CENTER)
					.darkStyle();
			ne.showError();
	  }
}
	
    public void Subtract() {
    	try {
    		double ctf1 = Double.parseDouble(tf1.getText());
    		double ctf2 = Double.parseDouble(tf2.getText());
    		double answer = ctf1 - ctf2;
    		output.setText(Double.toString(answer));
    	  }catch(Exception e) {
    		  Notifications ne = Notifications.create()
    					.title("Error")
    					.text("Type a number")
    					.graphic(null)
    					.hideAfter(Duration.seconds(10))
    					.position(Pos.CENTER)
    					.darkStyle();
    			ne.showError();
    	  }
	}

    public void Multiply() {
    	try {
    		double ctf1 = Double.parseDouble(tf1.getText());
    		double ctf2 = Double.parseDouble(tf2.getText());
    		double answer = ctf1 * ctf2;
    		output.setText(Double.toString(answer));
    	  }catch(Exception e) {
    		  Notifications ne = Notifications.create()
    					.title("Error")
    					.text("Type a number")
    					.graphic(null)
    					.hideAfter(Duration.seconds(10))
    					.position(Pos.CENTER)
    					.darkStyle();
    			ne.showError();
    	  }
    }

    public void Division() {
    	try {
    		double ctf1 = Double.parseDouble(tf1.getText());
    		double ctf2 = Double.parseDouble(tf2.getText());
    		double answer = ctf1 / ctf2;
    		output.setText(Double.toString(answer));
    	  }catch(Exception e) {
    		  Notifications ne = Notifications.create()
    					.title("Error")
    					.text("Type a number")
    					.graphic(null)
    					.hideAfter(Duration.seconds(10))
    					.position(Pos.CENTER)
    					.darkStyle();
    			ne.showError();
    	  }
    }
	
}
