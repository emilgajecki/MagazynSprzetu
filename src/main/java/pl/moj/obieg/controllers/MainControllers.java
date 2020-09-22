package pl.moj.obieg.controllers;

import javafx.fxml.FXML;
import javafx.scene.layout.BorderPane;


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


}
