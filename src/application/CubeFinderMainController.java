package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class CubeFinderMainController {

    @FXML
    private JFXTextField base;

    @FXML
    private JFXButton Show;

    private double answer;

    public void Cube() {
        try {
            double value = Double.parseDouble(base.getText());
            answer = value * value * value;

            Show.setVisible(true);
        }catch (Exception exception) {
            Notifications ne = Notifications.create()
                    .title("Error")
                    .text("Type a valid number")
                    .graphic(null)
                    .hideAfter(Duration.seconds(12))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();

            Show.setVisible(false);
            base.setText("");
        }
    }

    public void Show() {
        Notifications ne = Notifications.create()
                .title("Answer")
                .text("The Cube of " + base.getText() + " is " +Double.toString(answer))
                .graphic(null)
                .hideAfter(Duration.hours(10))
                .position(Pos.CENTER)
                .darkStyle();
        ne.showInformation();
    }

    public void Reset() {
        base.setText("");
        Show.setVisible(false);
    }

    public void Help() {
        Notifications ne = Notifications.create()
                .title("Help")
                .text("This tool is used to find the cube of the numbers")
                .graphic(null)
                .hideAfter(Duration.seconds(12))
                .position(Pos.CENTER)
                .darkStyle();
        ne.showInformation();
    }

}
