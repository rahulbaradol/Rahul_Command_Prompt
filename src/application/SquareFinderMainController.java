package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class SquareFinderMainController {

    @FXML
    private JFXTextField base;

    @FXML
    private JFXButton Show;

    private double square;

    public void Square() {
        try {
            double baseValue = Double.parseDouble(base.getText());
            square = baseValue * baseValue;

            Show.setVisible(true);
        }catch(Exception exception) {
            Show.setVisible(false);
            base.setText("");

            Notifications ne = Notifications.create()
                    .title("Error")
                    .text("Enter a valid number")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();
        }
    }

    public void Show() {
        Notifications nAnswer = Notifications.create()
                .title("Answer")
                .text("The Square of " + base.getText() + " is " + square)
                .graphic(null)
                .hideAfter(Duration.hours(10))
                .position(Pos.CENTER)
                .darkStyle();
        nAnswer.showInformation();
    }

    public void Reset() {
        base.setText("");
        Show.setVisible(false);
    }

    public void Help() {
        Notifications ne = Notifications.create()
                .title("Help")
                .text("This tool is used to find the squares of the numbers")
                .graphic(null)
                .hideAfter(Duration.seconds(12))
                .position(Pos.CENTER)
                .darkStyle();
        ne.showInformation();
    }

}