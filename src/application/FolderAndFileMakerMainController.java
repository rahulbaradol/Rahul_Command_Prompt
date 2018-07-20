package application;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import org.controlsfx.control.Notifications;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;

public class FolderAndFileMakerMainController {

	@FXML
	private JFXTextField MFolder_Location;
	
	@FXML
	private JFXTextField MFolder_Name;

	@FXML
	private JFXTextField MFile_Location;
	
	@FXML
	private JFXTextField MFile_Name;
	
	@FXML
	private JFXTextField MFile_Extension;

	// ================================ Folder ========================================== //

	public void CreateFolder() {
		File file = new File(MFolder_Location.getText() + "/" + MFolder_Name.getText());
		
		if(!file.exists()) {
			file.mkdir();
			
			Notifications n = Notifications.create()
					.title("Note")
					.text("The folder '" + MFolder_Name.getText() + "' has been successfully created in the location '" + MFolder_Location.getText() + "'")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			n.show();
			
		}else if(file.exists()) {
			Notifications nfe = Notifications.create()
					.title("Note")
					.text("The folder '" + MFolder_Name.getText() + "' already exists in the location '" + MFolder_Location.getText() + "'")
			        .graphic(null)
			        .hideAfter(Duration.seconds(10))
			        .position(Pos.CENTER)
			        .darkStyle();
			nfe.showWarning();
		}
		
	}

	public void Clear_Folder() {
		MFolder_Location.setText("");
		MFolder_Name.setText("");
	}
	
	// ================================ File ========================================== //
	
	public void CreateFile() {
		File file = new File(MFile_Location.getText() + "\\" + MFile_Name.getText() + MFile_Extension.getText());
		
		if(!file.exists()) {
			try {
				file.createNewFile();
				
				Notifications n = Notifications.create()
						.title("Note")
						.text("Your file '" + MFile_Name.getText() + "." + MFile_Extension.getText() + "' has been successfully created in the location '" + MFile_Location.getText() + "'")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				n.show();

				if(MFile_Extension.getText().equals(".java")) {
					PrintWriter pw = new PrintWriter(file);

					pw.println("public class " + MFile_Name.getText() + " {");
					pw.println("     public static void main(String[] args) {");
					pw.println("          System.out.println('Welcome to " + MFile_Name.getText() + "');");
					pw.println("     }");
					pw.println("}");
					pw.close();
				}else if(MFile_Extension.getText().equals(".html") || MFile_Extension.getText().equals(".htm") || MFile_Extension.getText().equals(".HTML")) {
					PrintWriter pw = new PrintWriter(file);

					pw.println("<html>");
					pw.println("<head>");
					pw.println("<title> " + MFile_Name.getText() + " </title>");
					pw.println("</head>");
					pw.println("");
					pw.println("<body>");
					pw.println("     <h1 align='CENTER'> Welcome to " + MFile_Name.getText() + " </h1>");
					pw.println("</body>");
					pw.println("</html");
					pw.close();
				}

			} catch (IOException e) {
				Notifications n = Notifications.create()
						.title("Error")
						.text("Error creating the file")
						.graphic(null)
						.hideAfter(Duration.seconds(6))
						.position(Pos.CENTER)
						.darkStyle();
				n.showError();
			}
		}else if(file.exists()) {
			Notifications nfle = Notifications.create()
					.title("Note")
					.text("The file '" + MFile_Name.getText() + "." + MFile_Extension.getText() + "' already exists in the location '" + MFile_Location.getText() + "'")
					.graphic(null)
					.hideAfter(Duration.seconds(6))
					.position(Pos.CENTER)
					.darkStyle();
			nfle.showWarning();
		}
	}
	
	public void Clear_File() {
		MFile_Location.setText("");
		MFile_Name.setText("");
		MFile_Extension.setText("");
	}
}