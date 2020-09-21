package pl.moj.obieg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import java.io.IOException;
import java.util.ResourceBundle;


public class MainControllers {

    @FXML
    private BorderPane borderPane;
    // wsptrzyknieęcie za pomocą kontrolera - fx:id + słowo Controller
    @FXML
    private MenuScreenController topMenuScreenController;

    @FXML
    private void initialize (MainControllers mainControllers){
        this.topMenuScreenController.setMainControllers(this);
    }

    public void setCenter (String fxmlPath)  {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);
        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(parent);
    }

}
