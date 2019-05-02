package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SwitchScene {

    private static SwitchScene instance;

    private Game game;
    private Parent view;
    private Stage window;

    public static SwitchScene getInstance(){
        if(instance == null) instance = new SwitchScene();
        return instance;
    }

    public void switchWithEvent(ActionEvent event, String name, Game game, String highscore) throws Exception {
        this.game = game;
        game.setHighscore(highscore);

        view = FXMLLoader.load(getClass().getResource(name));
        Scene scene = new Scene(view);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    public void switchWithOutEvent(String name, Game game) throws Exception{
        this.game = game;
        view = FXMLLoader.load(getClass().getResource(name));
        window.getScene().setRoot(view);
    }

    public Game getGame(){ return this.game; }

}
