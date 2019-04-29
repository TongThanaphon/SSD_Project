package game;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TimeUpController {

    @FXML private Label showScoreLabel;
    private SwitchScene sw = SwitchScene.getInstance();

    @FXML
    public void initialize(){
        showScoreLabel.setText("HelloWorld");
    }
}
