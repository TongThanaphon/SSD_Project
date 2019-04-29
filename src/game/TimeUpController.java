package game;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TimeUpController {

    @FXML private Button returnBtn;
    private SwitchScene sw = SwitchScene.getInstance();

    @FXML
    public void initialize(){}

    public void handleReturnBtn(ActionEvent event) throws Exception{
        sw.switchToPlay(event,"GUI/GameUI.fxml","0");
    }


}
