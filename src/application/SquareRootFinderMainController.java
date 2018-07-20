package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class SquareRootFinderMainController {

    @FXML
    private JFXTextField Value;

    @FXML
    private JFXButton Show;

    private double answer;

    public void Help() {
        Notifications nHelp = Notifications.create()
                .title("Help")
                .text("This software is used to find the square root of the given number.")
                .graphic(null)
                .hideAfter(Duration.seconds(10))
                .position(Pos.CENTER)
                .darkStyle();
        nHelp.showInformation();
    }

    public void SquareRoot() {
        try {
            answer = Math.sqrt(Double.parseDouble(Value.getText()));
            Show.setVisible(true);
        }catch (Exception exception) {
            Notifications nHelp = Notifications.create()
                    .title("Error")
                    .text("Type a valid number.")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            nHelp.showError();

            Value.setText("");
            Show.setVisible(false);
        }
    }

    public void Show() {
        Notifications nHelp = Notifications.create()
                .title("Answer")
                .text("The Square Root of " + Value.getText() + " is " + Double.toString(answer))
                .graphic(null)
                .hideAfter(Duration.hours(10))
                .position(Pos.CENTER)
                .darkStyle();
        nHelp.showInformation();
    }

    public void Reset() {
        Value.setText("");
        Show.setVisible(false);
    }

}
