package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameController {

    @FXML private Button lv2Btn;
    @FXML private Button lv3Btn;
    @FXML private Button lv4Btn;
    @FXML private Button lv5Btn;
    @FXML private Button lv6Btn;
    @FXML private Button lv7Btn;
    @FXML private Button lv8Btn;
    @FXML private Button lv9Btn;
    @FXML private Button lv10Btn;
    @FXML private Button lv11Btn;
    @FXML private Button lv12Btn;

    @FXML private Label lv2Label;
    @FXML private Label lv3Label;
    @FXML private Label lv4Label;
    @FXML private Label lv5Label;
    @FXML private Label lv6Label;
    @FXML private Label lv7Label;
    @FXML private Label lv8Label;
    @FXML private Label lv9Label;
    @FXML private Label lv10Label;
    @FXML private Label lv11Label;
    @FXML private Label lv12Label;

    private SwitchScene sw = SwitchScene.getInstance();

    @FXML
    public void initialize(){}

    public void handleLV2Btn(ActionEvent event) throws  Exception{
        sw.switchToPlay(event, "GUI/PlayUI.fxml", "2");
    }

    public void handleLV3Btn(ActionEvent event) throws  Exception{
        System.out.println("LV3");
    }

    public void handleLV4Btn(ActionEvent event) throws  Exception{
        System.out.println("LV4");
    }

    public void handleLV5Btn(ActionEvent event) throws  Exception{
        System.out.println("LV5");
    }

    public void handleLV6Btn(ActionEvent event) throws  Exception{
        System.out.println("LV6");
    }

    public void handleLV7Btn(ActionEvent event) throws  Exception{
        System.out.println("LV7");
    }

    public void handleLV8Btn(ActionEvent event) throws  Exception{
        System.out.println("LV8");
    }

    public void handleLV9Btn(ActionEvent event) throws  Exception{
        System.out.println("LV9");
    }

    public void handleLV10Btn(ActionEvent event) throws  Exception{
        System.out.println("LV10");
    }

    public void handleLV11Btn(ActionEvent event) throws  Exception{
        System.out.println("LV11");
    }

    public void handleLV12Btn(ActionEvent event) throws  Exception{
        System.out.println("LV12");
    }
}
