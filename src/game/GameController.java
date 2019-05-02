package game;

import javafx.application.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Timer;

import java.util.*;

public class GameController {

    @FXML private Label title;
    @FXML private Label yLabel;
    @FXML private Label xLabel;
    @FXML private Label timeLabel;
    @FXML private Label scoreLabel;
    @FXML private Label wrongLabel;
    @FXML private Button ans1Btn;
    @FXML private Button ans2Btn;
    @FXML private Button ans3Btn;
    @FXML private Button ans4Btn;

    private int interval = 10;
    private Game game ;
    private Timer timer ;
    private SwitchScene sw = SwitchScene.getInstance();

    @FXML
    public void initialize(){
        game = sw.getGame();
        title.setText(game.getLV());
        yLabel.setText(game.getLV());
        xLabel.setText(game.getX());
        scoreLabel.setText("Score: " + game.getScore());
        wrongLabel.setText("Wrong: " + game.getWrongN());
        ans1Btn.setText("0");
        ans2Btn.setText("0");
        ans3Btn.setText("0");
        ans4Btn.setText("0");
        randomChoice();
        setTimer();
    }

    public void handleAns1Btn(ActionEvent event){
        String answer = ans1Btn.getText();
        game.checkCorrect(answer);
        xLabel.setText(game.getX());
        scoreLabel.setText("Score: " + game.getScore());
        wrongLabel.setText("Wrong: " + game.getWrongN());
        randomChoice();
    }

    public void handleAns2Btn(ActionEvent event){
        String answer = ans2Btn.getText();
        game.checkCorrect(answer);
        xLabel.setText(game.getX());
        scoreLabel.setText("Score: " + game.getScore());
        wrongLabel.setText("Wrong: " + game.getWrongN());
        randomChoice();
    }

    public void handleAns3Btn(ActionEvent event){
        String answer = ans3Btn.getText();
        game.checkCorrect(answer);
        xLabel.setText(game.getX());
        scoreLabel.setText("Score: " + game.getScore());
        wrongLabel.setText("Wrong: " + game.getWrongN());
        randomChoice();
    }

    public void handleAns4Btn(ActionEvent event){
        String answer = ans4Btn.getText();
        game.checkCorrect(answer);
        xLabel.setText(game.getX());
        scoreLabel.setText("Score: " + game.getScore());
        wrongLabel.setText("Wrong: " + game.getWrongN());
        randomChoice();
    }

    public void randomChoice(){
        Random rand = new Random();
        String answer;
        int correctChoice = rand.nextInt(4)+1;
        switch (correctChoice){
            case 1 :
                answer = game.getAnswer();
                ans1Btn.setText(answer);
                ans2Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans4Btn.getText()));
                ans3Btn.setText(game.getIncorrectAnswer(ans2Btn.getText(),ans4Btn.getText()));
                ans4Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans2Btn.getText()));
                break;
            case 2 :
                answer = game.getAnswer();
                ans2Btn.setText(answer);
                ans1Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans4Btn.getText()));
                ans3Btn.setText(game.getIncorrectAnswer(ans1Btn.getText(),ans4Btn.getText()));
                ans4Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans1Btn.getText()));
                break;
            case 3 :
                answer = game.getAnswer();
                ans3Btn.setText(answer);
                ans2Btn.setText(game.getIncorrectAnswer(ans1Btn.getText(),ans4Btn.getText()));
                ans1Btn.setText(game.getIncorrectAnswer(ans2Btn.getText(),ans4Btn.getText()));
                ans4Btn.setText(game.getIncorrectAnswer(ans1Btn.getText(),ans2Btn.getText()));
                break;
            case 4 :
                answer = game.getAnswer();
                ans4Btn.setText(answer);
                ans1Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans2Btn.getText()));
                ans3Btn.setText(game.getIncorrectAnswer(ans1Btn.getText(),ans2Btn.getText()));
                ans2Btn.setText(game.getIncorrectAnswer(ans3Btn.getText(),ans1Btn.getText()));
                break;
        }
    }

    public void setTime(String time){
        timeLabel.setText("Time: " + time);
    }

    public void setTimer() {
        timer = new Timer();
        setTime(Integer.toString(interval));
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                if(interval > 0)
                {
                    Platform.runLater(()-> setTime(Integer.toString(interval)));
                    interval--;
                }
                else {
                    timer.cancel();
                    try {
                        game.updateHighscore(game.getHighscore());
                        sw.switchWithOutEvent("GUI/GameOverUI.fxml", game);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }, 1000,1000);
    }
}
