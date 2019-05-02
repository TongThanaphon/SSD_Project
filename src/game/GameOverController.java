package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class GameOverController {

    @FXML private Button backBtn;
    @FXML private Label scoreLabel;
    @FXML private Label highscoreLabel;

    private SwitchScene sw = SwitchScene.getInstance();

    @FXML
    public void initialize(){
        Game game = sw.getGame();
        scoreLabel.setText("Score: " + game.getScore());
        if(Integer.parseInt(game.getScore())>Integer.parseInt(game.getHighscore())){
            highscoreLabel.setText("New high score: " + game.getScore());
        }else {
            highscoreLabel.setText("High score: " + game.getHighscore());
        }
    }

    public void handleBackBtn(ActionEvent event) throws Exception{
        sw.switchWithOutEvent("GUI/SelectUI.fxml", null);
    }


}
