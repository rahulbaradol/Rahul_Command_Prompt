package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class PowerFinderMainController {

    @FXML
    private JFXTextField base;

    @FXML
    private JFXTextField power;

    @FXML
    private JFXButton Show;

    private double  answer;

    public void Help() {
        Notifications nHelp = Notifications.create()
                .title("Note")
                .text("This software is used to find the powers except 2 and 3. If you want to find the squares or cubes then visit the software named 'Square finder' or 'Cube Finder' designed by Rahul Baradol.")
                .graphic(null)
                .hideAfter(Duration.seconds(12))
                .position(Pos.CENTER)
                .darkStyle();
        nHelp.showInformation();
    }

    public void Find() {
        try {
            double vBase = Double.parseDouble(base.getText());
            double vPower = Double.parseDouble(power.getText());

            answer = Math.pow(vBase, vPower);
            Show.setVisible(true);

            if(power.getText().equals("2") || power.getText().equals("3")) {
                Notifications n2or3 = Notifications.create()
                        .title("Note")
                        .text("This software is used to find the powers except 2 and 3. If you want to find the squares or cubes then visit the software named 'Square finder' or 'Cube Finder' designed by Rahul Baradol.")
                        .graphic(null)
                        .hideAfter(Duration.hours(10))
                        .position(Pos.CENTER)
                        .darkStyle();
                n2or3.showWarning();

                Show.setVisible(false);
                power.setText("");
            }

        }catch (Exception exception) {
            Notifications ne = Notifications.create()
                    .title("Error")
                    .text("Type a valid number")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();

            Show.setVisible(false);
            power.setText("");
            base.setText("");
        }
    }

    public void Show() {
        Notifications nA = Notifications.create()
                .title("Answer")
                .text(base.getText() + " rays to " + power.getText() + " is " +Double.toString(answer))
                .graphic(null)
                .hideAfter(Duration.hours(10))
                .position(Pos.CENTER)
                .darkStyle();
        nA.showInformation();
    }

    public void Reset() {
        base.setText("");
        power.setText("");

        Show.setVisible(false);
    }

}
