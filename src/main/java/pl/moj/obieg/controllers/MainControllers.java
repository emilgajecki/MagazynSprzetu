package pl.moj.obieg.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.util.ResourceBundle;


public class MainControllers {

    //wstrzykiwanie odbywa sie przez fx:id z słowem Conetroller
    @FXML
    private MenuScreenController topMenuButtonsController;

    @FXML
    private BorderPane borderPane;

    @FXML
    private void initialize() {
        // chcemy przekazac cala referencje aby sterowac borderPane -
        // podmienić srodkowe okno
        topMenuButtonsController.setMainControllers(this);
    }

    //tworzymy formatke wciskajaca w srodek ona nowe zakladki
    public void setCenter(String fxmlPath){
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource(fxmlPath));
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        loader.setResources(bundle);
        // po parent wszystekie kontrolery dziedzicza
        Parent parent = null;
        try {
            parent = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        borderPane.setCenter(parent);
    }

}
