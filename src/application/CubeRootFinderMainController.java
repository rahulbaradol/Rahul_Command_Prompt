package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class CubeRootFinderMainController {

    @FXML
    private JFXTextField Value;

    @FXML
    private JFXButton Show;

    private double answer;

    public void CubeRoot() {
        try {
            answer = Math.cbrt(Double.parseDouble(Value.getText()));
            Show.setVisible(true);
        }catch (Exception exception) {
            Notifications nE = Notifications.create()
                    .title("Error")
                    .text("Type a valid number")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            nE.showError();

            Value.setText("");
            Show.setVisible(false);
        }
    }

    public void Show() {
        Notifications nA = Notifications.create()
                .title("Answer")
                .text("The cube root of " + Value.getText() + " is " + Double.toString(answer))
                .graphic(null)
                .hideAfter(Duration.hours(10))
                .position(Pos.CENTER)
                .darkStyle();
        nA.showInformation();
    }

    public void Reset() {
        Value.setText("");
        Show.setVisible(false);
    }

    public void Help() {
        Notifications nHelp = Notifications.create()
                .title("Help")
                .text("This tool is used to find the cube root of a given number")
                .graphic(null)
                .hideAfter(Duration.seconds(10))
                .position(Pos.CENTER)
                .darkStyle();
        nHelp.showInformation();
    }

}