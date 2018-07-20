package application;

import org.controlsfx.control.Notifications;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class TableLearningMainController {

	@FXML
	private JFXTextField TableNumber;
	
	@FXML
	private Label tb1;
	
	@FXML
	private Label tb2;
	
	@FXML
	private Label tb3;
	
	@FXML
	private Label tb4;
	
	@FXML
	private Label tb5;
	
	@FXML
	private Label tb6;
	
	@FXML
	private Label tb7;
	
	@FXML
	private Label tb8;
	
	@FXML
	private Label tb9;
	
	@FXML
	private Label tb10;
	
	public void TableFinder() {
		
		if(TableNumber.getText().equals("Function.Exit")) {
			
				   if(TableNumber.getText().equals("Function.Exit")) {
					   Notifications nexit = Notifications.create()
							   .title("Table Learning - Exit")
							   .text("Are you sure you want to exit? If you want to exit, then, click on the notification. If no, then click on the close button.")
							   .graphic(null)
							   .hideAfter(Duration.hours(10000))
							   .position(Pos.CENTER)
							   .darkStyle()
							   .onAction(new EventHandler<ActionEvent>() {

								   @Override
								    public void handle(ActionEvent arg0) {
									      System.exit(0);
								    } 
								   
							   });
					   nexit.showConfirm();
					   
					  
				   }
			
		}else {
			
				try {
					   double tn = Double.parseDouble(TableNumber.getText());
				
					   double tba = tn;
				
					   double tba1 = tba * 1;
					   tb1.setText(Double.toString(tba1));
				
					   double tba2 = tba * 2;
					   tb2.setText(Double.toString(tba2));
				
					   double tba3 = tba * 3;
					   tb3.setText(Double.toString(tba3));
				
					   double tba4 = tba * 4;
					   tb4.setText(Double.toString(tba4));
				
					   double tba5 = tba * 5;
					   tb5.setText(Double.toString(tba5));
				
					   double tba6 = tba * 6;
					   tb6.setText(Double.toString(tba6));
				
					   double tba7 = tba * 7;
					   tb7.setText(Double.toString(tba7));
				
					   double tba8 = tba * 8;
					   tb8.setText(Double.toString(tba8));
				
					   double tba9 = tba * 9;
					   tb9.setText(Double.toString(tba9));
				
					   double tba10 = tba * 10;
					   tb10.setText(Double.toString(tba10));
				   }catch(Exception exception) {
					   Notifications n = Notifications.create()
								.title("Command Prompt - Error")
								.text("Type a valid number. '" + TableNumber.getText() + "' is not a valid number")
								.graphic(null)
								.hideAfter(Duration.seconds(10))
								.position(Pos.CENTER)
								.darkStyle();
						n.showError();
				   }
			
		  }
		 
}
	
	  public void Clear() {
		 TableNumber.setText("");
		 
		 tb1.setText("");
		 tb2.setText("");
		 tb3.setText("");
		 tb4.setText("");
		 tb5.setText("");
		 tb6.setText("");
		 tb7.setText("");
		 tb8.setText("");
		 tb9.setText("");
		 tb10.setText("");
	  }
	  
}