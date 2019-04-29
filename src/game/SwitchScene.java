package game;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SwitchScene {

    private static SwitchScene instance;

    private String lv;
    private Parent view;
    private Stage window;

    public static SwitchScene getInstance(){
        if(instance == null) instance = new SwitchScene();
        return instance;
    }

    public void switchToPlay(ActionEvent event, String name, String lv) throws Exception {
        this.lv = lv;

        view = FXMLLoader.load(getClass().getResource(name));
        Scene scene = new Scene(view);
        window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(scene);
        window.show();
    }

    public void switchToEnd(Stage window, String name) throws Exception{

    }

    public String getLV(){ return this.lv; }

}
