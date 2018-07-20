package application;

import com.jfoenix.controls.JFXTextArea;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.util.Duration;
import org.controlsfx.control.Notifications;
import java.io.IOException;

public class QuestionAskingMainController {

    @FXML
    private AnchorPane QuestionPrompt;

    @FXML
    private JFXTextArea Question;

    @FXML
    private JFXTextArea QuestionLine;

    @FXML
    private Label Mouse;

    private int numberOfTimesTypedEmpty = 0;
    private int numberOfTimesAskedHelp = 0;

    public void StartCommandPrompt() {
        Notifications nConfirmStartQuestionPrompt = Notifications.create()
                .title("Are you sure?")
                .text("Are you sure that you want to enter Command Prompt Mode? If yes then click on the notification, if no then click on the close button")
                .graphic(null)
                .hideAfter(Duration.hours(10000))
                .position(Pos.CENTER)
                .darkStyle()
                .onAction((actionEvent) -> {
                    try {
                        Parent CommandPrompt = FXMLLoader.load(getClass().getResource("/application/CommandPrompt.fxml"));
                        QuestionPrompt.getChildren().setAll(CommandPrompt);
                    } catch (IOException e) {
                        Notifications nc = Notifications.create()
                                .title("Error")
                                .text("Could not find the file.")
                                .graphic(null)
                                .hideAfter(Duration.seconds(10))
                                .position(Pos.CENTER)
                                .darkStyle();
                        nc.showError();
                    }
                });

        nConfirmStartQuestionPrompt.showConfirm();
    }

    public void Help() {
        Notifications nHelp = Notifications.create()
                .title("Help")
                .text("This software is used to ask any questions you want which have been uploaded")
                .graphic(null)
                .hideAfter(Duration.seconds(10))
                .position(Pos.CENTER)
                .darkStyle();
        nHelp.showInformation();

        numberOfTimesAskedHelp++;

        if(numberOfTimesAskedHelp == 20) {
            Notifications nNumberOfAskedHelp = Notifications.create()
                    .title("A Message from Question Prompt")
                    .text("Hey User, you have asked 20 times help! I don't have any problem, but, what's there in asking 20 times help!! Are you kidding?!")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            nNumberOfAskedHelp.showInformation();
        }
    }

    public void AskQuestion() {
        String qu = Question.getText();

        if(qu.equals("Question: What is earth?") || qu.equals("Question: What is Earth?")) {
            Notifications nWIAS = Notifications.create()
                    .title("Answer")
                    .text("The Earth is a unique planet in the Sun's family. It is the fifth largest planet on the solar system. " +
                              "The diameter of Earth is approximately 4 times greater than the Moon and 107 times smaller than that of the Sun.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            nWIAS.showInformation();

            QuestionLine.setText("Question Occupied. What is Earth?");

        }else if(qu.equals("Question: What is a Computer?") || qu.equals("Question: What is a computer?") || qu.equals("Question: What is Computer?") || qu.equals("Question: What is computer?")) {
            Notifications ne = Notifications.create()
                    .title("Answer")
                    .text("A Computer is a electronic device which is capable of performing computations. Computer is developed or created by Charles Babage.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showInformation();

            QuestionLine.setText("Question Occupied. What is a Computer?");

        }else if(qu.equals("Question: What is Sun?") || qu.equals("Question: What is sun?")) {
            Notifications ne = Notifications.create()
                    .title("Answer")
                    .text("A Sun is a star nearest to the Earth. The Sun is approximately 107 times larger than the Earth's diameter.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showInformation();

            QuestionLine.setText("Question Occupied. What is Sun?");

        }else if(qu.equals("Question: What is a Square?") || qu.equals("Question: What is a square?")) {
            Notifications ne = Notifications.create()
                    .title("Answer")
                    .text("A Square is 4 sided closed figure having all sides equal.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showInformation();

            QuestionLine.setText("Question Occupied. What is a Square?");

        }else if(qu.equals("Question: What is Square?_MathPowers") || qu.equals("Question: What is square?_MathPowers")) {
            Notifications n = Notifications.create()
                    .title("Answer")
                    .text("A Square is a value obtained by multiplying a number itself. Click on the notification to show examples.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle()
                    .onAction(event -> {
                        Notifications nExample = Notifications.create()
                                .title("Examples for squares")
                                .text("Square of 2 is 4, Square of 5 is 25, Square of 10 is 100, Square of 50 is 2500.")
                                .graphic(null)
                                .hideAfter(Duration.hours(10))
                                .position(Pos.CENTER)
                                .darkStyle();
                        nExample.showInformation();
                    });

            n.showInformation();
        }else if(qu.equals("Question: What is Cube?") || qu.equals("Question: What is cube?")) {
            Notifications n = Notifications.create()
                    .title("Answer")
                    .text("A Cube is a 3 dimensional object having all sides equal.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            n.showInformation();
        }else if(qu.equals("Question: What is Cube?_MathPowers") || qu.equals("Question: What is cube?_MathPowers")) {
            Notifications n = Notifications.create()
                    .title("Answer")
                    .text("A Cube is a value obtained after multiplying a number 3 times itself. Click on the notification to show the examples.")
                    .graphic(null)
                    .hideAfter(Duration.hours(10))
                    .position(Pos.CENTER)
                    .darkStyle()
                    .onAction(event -> {
                        Notifications nExample = Notifications.create()
                                .title("Example for Cubes")
                                .text("Cube of 2 is 8, Cube of 5 is 125, Cube of 10 is 1000, Cube of 50 is 125000.")
                                .graphic(null)
                                .hideAfter(Duration.hours(10))
                                .position(Pos.CENTER)
                                .darkStyle();
                        nExample.showInformation();
                    });
            n.showInformation();
        }else if(qu.equals("") || qu.equals(" ")) {

            if(numberOfTimesTypedEmpty < 4) {
                Notifications ne = Notifications.create()
                        .title("Note")
                        .text("The main starting code 'Question: ' is missing. Type it.")
                        .graphic(null)
                        .hideAfter(Duration.seconds(10))
                        .position(Pos.CENTER)
                        .darkStyle();
                ne.showWarning();
            }

            numberOfTimesTypedEmpty++;

            if(numberOfTimesTypedEmpty >= 4) {
                Notifications nAF = Notifications.create()
                        .title("Note")
                        .text("You are not typing the main starting code. If you want to ask any question, you must type that. Now, click on the notification if you want to autofill the textfield by 'Question: '.")
                        .graphic(null)
                        .hideAfter(Duration.seconds(10))
                        .position(Pos.CENTER)
                        .darkStyle()
                        .onAction((actionEvent) -> {
                              Question.setText("Question: ");
                        });

                nAF.showWarning();
            }

        }else {
            Notifications ne = Notifications.create()
                    .title("Note")
                    .text("The following question is not defined. It may have not uploaded.")
                    .graphic(null)
                    .hideAfter(Duration.seconds(10))
                    .position(Pos.CENTER)
                    .darkStyle();
            ne.showWarning();

            QuestionLine.setText("Invalid Question.");

        }

    }

    public void Reset() {
        Notifications nConfirmReset = Notifications.create()
                .title("Are you sure?")
                .text("Are you sure you want to reset the text area? If yes then click on the notification, if no then click on the close button.")
                .graphic(null)
                .hideAfter(Duration.hours(10000))
                .position(Pos.CENTER)
                .darkStyle()
                .onAction((Erase) -> {
                        Question.setText("Question: ");
                        QuestionLine.setText("Waiting for Questions............");
                 });

        nConfirmReset.showConfirm();
    }

    public void MouseEnteredPromptArea() {
        Mouse.setText("Mouse entered the Question Prompt Area");
    }

    public void MouseExitedPromptArea() {
        Mouse.setText("Mouse exited the Question Prompt Area");
    }

    public void MouseEnteredTextArea() {
        Mouse.setText("Mouse entered the Text Area");
    }

    public void MouseExitedTextArea() {
        Mouse.setText("Mouse exited the Text Area");
    }

    public void MouseClickedAskButton() {
        Mouse.setText("You clicked on the Ask Button");
    }

    public void MouseClickedResetButton() {
        Mouse.setText("You clicked on the Reset Button");
    }

    public void MouseClickedTextArea() {
        Mouse.setText("You clicked on the Text Area");
    }

    public void TypedInTextAreaButton() {
        Mouse.setText("You are typing in the Text Area");
        QuestionLine.setText("Getting the Question......");
    }
}