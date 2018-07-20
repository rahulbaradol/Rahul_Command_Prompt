package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class CalculaterMainController {

	double total1 = 0.0;
	double total2 = 0.0;
	private char math_operator;
	
	@FXML
	private JFXTextField tf;
	
	@FXML
	private JFXButton plus;
	
	@FXML
	private JFXButton subtract;
	
	@FXML
	private JFXButton divide;
	
	@FXML
	private JFXButton modulas;
	
	@FXML
	private JFXButton multiply;

	public void Exit() {
		Notifications nexit = Notifications.create()
				.title("Are you sure?")
				.text("Are you sure you want to exit Calculater, if yes then click on the notification, if no then click on close button")
				.graphic(null)
				.hideAfter(Duration.hours(10000))
				.position(Pos.CENTER)
				.darkStyle()
				.onAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent event) {
						System.exit(0);
					}

				});

		nexit.showConfirm();
	}

	public void num0() {
		String printnum0 = tf.getText() + "0";
		tf.setText(printnum0);
	}
	
	public void num1() {
		String printnum1 = tf.getText() + "1";
		tf.setText(printnum1);
	}
	
	public void num2() {
		String printnum2 = tf.getText() + "2";
		tf.setText(printnum2);
	}
	
	public void num3() {
		String printnum3 = tf.getText() + "3";
		tf.setText(printnum3);
	}
	
	public void num4() {
		String printnum4 = tf.getText() + "4";
		tf.setText(printnum4);
	}
	
	public void num5() {
		String printnum5 = tf.getText() + "5";
		tf.setText(printnum5);
	}
	
	public void num6() {
		String printnum6 = tf.getText() + "6";
		tf.setText(printnum6);
	}
	
	public void num7() {
		String printnum7 = tf.getText() + "7";
		tf.setText(printnum7);
	}
	
	public void num8() {
		String printnum8 = tf.getText() + "8";
		tf.setText(printnum8);
	}
	
	public void num9() {
		String printnum9 = tf.getText() + "9";
		tf.setText(printnum9);
	}
	
	public void dot() {
		String printdot = tf.getText() + ".";
		tf.setText(printdot);
	}
	
	public void Clear() {
		tf.setText("");
		total2 = 0;
	}
	
	public void getOperator(String btnText) {
		try {
		math_operator = btnText.charAt(0);
		total1 = total1 + Double.parseDouble(tf.getText());
		tf.setText("");
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void plus() {
		try {
		    String button_text = plus.getText();
		    getOperator(button_text);
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void subtract() {
		try {
		   String button_text = subtract.getText();
		   getOperator(button_text);
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void divide() {
		try {
		   String button_text = divide.getText();
		   getOperator(button_text);
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void multiply() {
		try {
		    String button_text = multiply.getText();
		    getOperator(button_text);
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void modulas() {
		try {
		    String button_text = modulas.getText();
		    getOperator(button_text);
		}catch(Exception e) {
			Notifications ne = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			ne.show();
		}
	}
	
	public void equals() {
		try {
	       switch( math_operator ) {
	       case '+':
		   total2 = total1 + Double.parseDouble(tf.getText());
		   break;
	
	      case '-':
		  total2 = total1 - Double.parseDouble(tf.getText());
		  break;
	
	     case '/':
		 total2 = total1 / Double.parseDouble(tf.getText());
		 break;
	
	     case '*':
		 total2 = total1 * Double.parseDouble(tf.getText());
		 break;
	
	    case '%':
		total2 = total1 % Double.parseDouble(tf.getText());
		break;
	       
	}		
	       }catch(Exception e) {
	    	   Notifications ne = Notifications.create()
						.title("Error")
						.text("Type a valid number")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				ne.show();
		}

		tf.setText(Double.toString(total2));
		total1 = 0;
	}
	
}
