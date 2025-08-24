package jkk.controller;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import jkk.application.CityMap;
import jkk.application.Map;
import jkk.application.WildernessMap;
import jkk.view.Game;


public class GameController {
    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private BorderPane borderPane;
    @FXML
    private TextArea mapDisplay;
    

    @FXML
    private void generateCityMap() {
        Map cityMap = new CityMap();
        mapDisplay.setText(cityMap.getMapAsString());
    }
    
    @FXML
    private void generateWildernessMap() {
        Map wildernessMap = new WildernessMap();
        mapDisplay.setText(wildernessMap.getMapAsString());
    }

    public static void main(String[] args) {
        Game.launch(Game.class);
    }
}