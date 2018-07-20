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

public class CurrencyConverterMainController {

    @FXML
    private JFXTextField From;

    @FXML
    private JFXTextField To;

    @FXML
    private JFXTextField Value;

    // ------------------------------

    @FXML
    private JFXButton Convert;

    @FXML
    private JFXButton Show;

    // -------------------------------

    @FXML
    private Label converted;

    // --------------------------------

    private double answer;

    public void Check() {

        String f = From.getText();
        String t = To.getText();

        if(f.equals("Rupee") && t.equals("Dollar")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else if(f.equals("Dollar") && t.equals("Rupee")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else if(f.equals("Rupee") && t.equals("Yen")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else if(f.equals("Yen") && t.equals("Rupee")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else if(f.equals("Rupee")  && t.equals("Euros")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else if(f.equals("Euros") && t.equals("Rupee")) {
            Value.setVisible(true);
            Convert.setVisible(true);
            converted.setVisible(true);
        }else {
            Value.setVisible(false);
            Convert.setVisible(false);
            Show.setVisible(false);
            converted.setVisible(false);

            Notifications ne = Notifications.create()
                    .title("Wrong Input")
                    .text("Invalid Currency")
                    .graphic(null)
                    .hideAfter(Duration.hours(10000))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showError();

            From.setText("");
            To.setText("");
            Value.setText("");
            converted.setText("");
        }
    }

    public void Convert() {

        try {
            double value = Double.parseDouble(Value.getText());
            String f = From.getText();
            String t = To.getText();

            if (f.equals("Rupee") && t.equals("Dollar")) {
                   answer = value / 65;
                   converted.setText("Successfully Converted");
                   Show.setVisible(true);
            } else if (f.equals("Dollar") && t.equals("Rupee")) {
                  answer = value * 65;
                  converted.setText("Successfully Converted");
                  Show.setVisible(true);
            } else if (f.equals("Rupee") && t.equals("Yen")) {
                  answer = value / 25;
                  converted.setText("Successfully Converted");
                  Show.setVisible(true);
            } else if (f.equals("Yen") && t.equals("Rupee")) {
                answer = value * 25;
                converted.setText("Successfully Converted");
                Show.setVisible(true);
            } else if (f.equals("Rupee") && t.equals("Euros")) {
                answer = value / 105;
                converted.setText("Successfully Converted");
                Show.setVisible(true);
            }else if(f.equals("Euros") && t.equals("Rupee")) {
                answer = value * 105;
                converted.setText("Successfully Converted");
                Show.setVisible(true);
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

            converted.setText("");
            Value.setText("");
            Show.setVisible(false);
        }
    }

    public void Show() {
        Notifications ne = Notifications.create()
                .title("Answer")
                .text("The number you have thought of was " + Double.toString(answer))
                .graphic(null)
                .hideAfter(Duration.hours(10000))
                .position(Pos.CENTER)
                .darkStyle();
        ne.show();
    }

    public void Clear() {
         From.setText("");
         To.setText("");
         Value.setText("");
         converted.setText("");

         Value.setVisible(false);
         Show.setVisible(false);
         Convert.setVisible(false);
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