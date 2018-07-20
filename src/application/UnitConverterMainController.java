package application;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;

public class UnitConverterMainController {

    @FXML
    private JFXTextField From;

    @FXML
    private JFXTextField To;

    // -----------------------------

    @FXML
    private JFXTextField Value;

    @FXML
    private JFXButton Convert;

    @FXML
    private JFXButton Show;

    @FXML
    private Label converted;

    private double answer;
    private String unit;
    private String unitFXML;

    public void Check() {
        String fr = From.getText();
        String to = To.getText();

        if(fr.equals("Km") && to.equals("M")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            Show.setVisible(true);
            converted.setVisible(true);

            unitFXML = "Enter the value (Km)";
            Value.setPromptText(unitFXML);
        }else if(fr.equals("M") && to.equals("Km")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            Show.setVisible(true);
            converted.setVisible(true);

            unitFXML = "Enter the value (M)";
            Value.setPromptText(unitFXML);
        }else if(fr.equals("Km") && to.equals("Mile")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            Show.setVisible(true);
            converted.setVisible(true);

            unitFXML = "Enter the value (Km)";
            Value.setPromptText(unitFXML);
        }else if(fr.equals("Mile") && to.equals("Km")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            Show.setVisible(true);
            converted.setVisible(true);

            unitFXML = "Enter the value (Mile)";
            Value.setPromptText(unitFXML);
        }else {
            Notifications ne = Notifications.create()
                    .title("Error")
                    .text("Invalid Input")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();

            From.setText("");
            To.setText("");
            Value.setText("");
            converted.setText("");

            Value.setVisible(false);
            Convert.setVisible(false);
            Show.setVisible(false);
            converted.setVisible(false);
        }

    }

    public void Convert() {
        try {
            String fr = From.getText();
            String to = To.getText();
            double v = Double.parseDouble(Value.getText());

            if (fr.equals("Km") && to.equals("M")) {
                 answer = v * 1000;
                 unit = "Meter(s)";
            } else if (fr.equals("M") && to.equals("Km")) {
                answer = v / 1000;
                unit = "Km(s)";
            }else if(fr.equals("Km") && to.equals("Mile")) {
                answer = v / 2.6;
                unit = "Mile(s)";
            }else if(fr.equals("Mile") && to.equals("Km")) {
                 answer = v * 2.6;
                 unit = "Km(s)";
            }
        }catch(Exception exception) {
            Notifications ne = Notifications.create()
                    .title("Error")
                    .text("Type a valid number")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();
        }
    }

    public void Show() {
        Notifications ne = Notifications.create()
                .title("Answer")
                .text(Double.toString(answer) + " " + unit)
                .graphic(null)
                .hideAfter(Duration.seconds(10))
                .position(Pos.CENTER)
                .darkStyle();
        ne.show();
    }

    public void Clear() {
        Notifications nclear = Notifications.create()
                .title("Are you sure?")
                .text("Are you sure you want to clear everything, if yes then click on the notification, if no then click on the close button")
                .graphic(null)
                .hideAfter(Duration.hours(10000))
                .position(Pos.CENTER)
                .darkStyle()
                .onAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        From.setText("");
                        To.setText("");
                        Value.setText("");
                        converted.setText("");

                        Value.setVisible(false);
                        Convert.setVisible(false);
                        Show.setVisible(false);
                        converted.setVisible(false);
                    }
                });
        nclear.showConfirm();
    }

    public void Exit() {
        Notifications nexit = Notifications.create()
                .title("Are you sure?")
                .text("Are you sure you want to exit, if yes then click on the notification, if no then click on the close button")
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

}