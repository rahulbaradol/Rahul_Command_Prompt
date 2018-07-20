package application;

import org.controlsfx.control.Notifications;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class FunctionGeometryMainController {

	@FXML
	protected JFXTextField QN;
	
	@FXML
	protected JFXTextField L;
	
	@FXML
	protected JFXTextField Br;
	
	@FXML
	protected JFXTextField S;
	
	@FXML
	protected JFXTextField A;
	
	@FXML
	protected JFXTextField B;
	
	@FXML
	protected JFXTextField C;
	
	@FXML
	protected JFXTextField RC;
	
	@FXML
	protected JFXButton Perimeterofr;
	
	@FXML
	protected JFXButton Perimeterofs;
	
	@FXML
	protected JFXButton Perimeteroft;
	
	@FXML
	protected JFXButton Perimeterofc;
	
	@FXML
	protected Label rl;
	
	//-----
	
	protected boolean LB = false;
	protected boolean BrB = false;
	protected boolean SB = false;
	protected boolean AB = false;
	protected boolean BB = false;
	protected boolean CB = false;
	protected boolean RCB = false;
	protected boolean PerimeterofrB = false;
	protected boolean PerimeterofsB = false;
	protected boolean PerimeteroftB = false;
	protected boolean PerimeterofcB = false;
	protected boolean rlb = false;
	
	public void Check() {
		if(QN.getText().equals("Rectangle")) {
			LB = true;
			BrB = true;
			PerimeterofrB = true;
			
			//--
			
			SB = false;
			AB = false;
			BB = false;
			CB = false;
			RCB = false;
			rlb = false;
		}else if(QN.getText().equals("Square")) {
			SB = true;
			PerimeterofsB = true;
			
			//--
			
			LB = false;
			BrB = false;
			AB = false;
			BB = false;
			CB = false;
			RCB = false;
			rlb = false;
		}else if(QN.getText().equals("Triangle")) {
			AB = true;
			BB = true;
			CB = true;
			PerimeteroftB = true;
			
			//--
			
			LB = false;
			BrB = false;
			RCB = false;
			rlb = false;
			SB = false;
		}else if(QN.getText().equals("Circle")) {
			RCB = true;
			rlb = true;
			PerimeterofcB = true;
			
			//--
			
			AB = false;
			BB = false;
			CB = false;
			SB = false;
			LB = false;
			BrB = false;
		}else {
			Notifications n = Notifications.create()
					.title("Error")
					.text("Invalid Name")
					.graphic(null)
					.hideAfter(Duration.seconds(10))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
			LB = false;
			BrB = false;
			SB = false;
			AB = false;
			BB = false;
			CB = false;
			RCB = false;
			rlb = false;
			PerimeterofrB = false;
			PerimeterofsB = false;
			PerimeteroftB = false;
			PerimeterofcB = false;
		}
		
		if(LB && BrB && PerimeterofrB) {
			L.setVisible(true);
			Br.setVisible(true);
			Perimeterofr.setVisible(true);
		}
		
		if(SB && PerimeterofsB) {
			S.setVisible(true);
			Perimeterofs.setVisible(true);
		}
		
		if(AB && BB && CB && PerimeteroftB) {
			A.setVisible(true);
			B.setVisible(true);
			C.setVisible(true);
			Perimeteroft.setVisible(true);
		}
		
		if(RCB && PerimeterofcB) {
			RC.setVisible(true);
			Perimeterofc.setVisible(true);
		}
		
		if(rlb) {
			rl.setVisible(true);
		}
		
		//----
		
		if(!LB) {
			L.setVisible(false);
			L.setText("");
		}
		
		if(!BrB) {
			Br.setVisible(false);
			Br.setText("");
		}
		
		if(!SB) {
			S.setVisible(false);
			S.setText("");
		}
		
		if(!AB) {
			A.setVisible(false);
			A.setText("");
		}
		
		if(!BB) {
			B.setVisible(false);
			B.setText("");
		}
		
		if(!CB) {
			C.setVisible(false);
			C.setText("");
		}
		
		if(!RCB) {
			RC.setVisible(false);
			RC.setText("");
		}
		
		if(!rlb) {
			rl.setVisible(false);
		}
		
		if(!PerimeterofrB) {
			Perimeterofr.setVisible(false);
		}
		
		if(!PerimeterofsB) {
			Perimeterofs.setVisible(false);
		}
		
		if(!PerimeteroftB) {
			Perimeteroft.setVisible(false);
		}
		
		if(!PerimeterofcB) {
			Perimeterofc.setVisible(false);
		}
        
	}
	
	public void RectangleP() {
		try {
		    double CL = Double.parseDouble(L.getText());
		    double BrB = Double.parseDouble(Br.getText());
		
		    double answerr = 2 * (CL + BrB);
		    Notifications nr = Notifications.create()
				.title("Answer")
				.text(Double.toString(answerr))
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		     nr.show();
		}catch(Exception e) {
			Notifications n = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
			L.setText("");
			Br.setText("");
		}
	}
	
	public void SquareP() {
		try {
		    double CS = Double.parseDouble(S.getText());
		
		    double answers = 4 * CS;
		    Notifications nr = Notifications.create()
				.title("Answer")
				.text(Double.toString(answers))
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		     nr.show();
		}catch(Exception e) {
			Notifications n = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
			S.setText("");
		}
	}
	
	public void TriangleP() {
		try {
		    double CA = Double.parseDouble(A.getText());
		    double CB = Double.parseDouble(B.getText());
		    double CC = Double.parseDouble(C.getText());
		
		    double answert = CA + CB + CC;
		    Notifications nr = Notifications.create()
				.title("Answer")
				.text(Double.toString(answert))
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		     nr.show();
		}catch(Exception e) {
			Notifications n = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
			A.setText("");
			B.setText("");
			C.setText("");
		}
	}
	
	public void CircleP() {
		try {
		    double CRC = Double.parseDouble(RC.getText());
		
		    double answerc = 2 * 3.14 * CRC;
		    Notifications nr = Notifications.create()
				.title("Answer")
				.text(Double.toString(answerc))
				.graphic(null)
				.hideAfter(Duration.seconds(10))
				.position(Pos.CENTER)
				.darkStyle();
		     nr.show();
		}catch(Exception e) {
			Notifications n = Notifications.create()
					.title("Error")
					.text("Type a valid number")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
			RC.setText("");
		}
	}
	
	public void Clear() {
		QN.setText("");
		
	    LB = false;
	    BrB = false;
	    SB = false;
	    AB = false;
	    BB = false;
	    CB = false;
	    RCB = false;
		PerimeterofrB = false;
		PerimeterofsB = false;
		PerimeteroftB = false;
		PerimeterofcB = false;
		rlb = false;
		
		if(!LB) {
			L.setVisible(false);
			L.setText("");
		}
		
		if(!BrB) {
			Br.setVisible(false);
			Br.setText("");
		}
		
		if(!SB) {
			S.setVisible(false);
			S.setText("");
		}
		
		if(!AB) {
			A.setVisible(false);
			A.setText("");
		}
		
		if(!BB) {
			B.setVisible(false);
			B.setText("");
		}
		
		if(!CB) {
			C.setVisible(false);
			C.setText("");
		}
		
		if(!RCB) {
			RC.setVisible(false);
			RC.setText("");
		}
		
		if(!rlb) {
			rl.setVisible(false);
		}
		
		if(!PerimeterofrB) {
			Perimeterofr.setVisible(false);
		}
		
		if(!PerimeterofsB) {
			Perimeterofs.setVisible(false);
		}
		
		if(!PerimeteroftB) {
			Perimeteroft.setVisible(false);
		}
		
		if(!PerimeterofcB) {
			Perimeterofc.setVisible(false);
		}
	}
}
