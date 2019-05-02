package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;
import java.util.List;

public class SelectController {

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
    private Score sc = Score.getInstance();

    private List<String> listScore;

    @FXML
    public void initialize() throws Exception{
        listScore = new ArrayList<>();
        listScore = sc.readFile();

        lv2Label.setText(listScore.get(0));
        lv3Label.setText(listScore.get(1));
        lv4Label.setText(listScore.get(2));
        lv5Label.setText(listScore.get(3));
        lv6Label.setText(listScore.get(4));
        lv7Label.setText(listScore.get(5));
        lv8Label.setText(listScore.get(6));
        lv9Label.setText(listScore.get(7));
        lv10Label.setText(listScore.get(8));
        lv11Label.setText(listScore.get(9));
        lv12Label.setText(listScore.get(10));
    }

    public void handleLV2Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("2"), listScore.get(0));
    }

    public void handleLV3Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("3"), listScore.get(1));
    }

    public void handleLV4Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("4"), listScore.get(2));
    }

    public void handleLV5Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("5"), listScore.get(3));
    }

    public void handleLV6Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("6"), listScore.get(4));
    }

    public void handleLV7Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("7"), listScore.get(5));
    }

    public void handleLV8Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("8"), listScore.get(6));
    }

    public void handleLV9Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("9"), listScore.get(7));
    }

    public void handleLV10Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("10"), listScore.get(8));
    }

    public void handleLV11Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("11"), listScore.get(9));
    }

    public void handleLV12Btn(ActionEvent event) throws  Exception{
        sw.switchWithEvent(event, "GameUI.fxml", new Game("12"), listScore.get(10));
    }
}
