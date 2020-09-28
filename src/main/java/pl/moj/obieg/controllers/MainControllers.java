package pl.moj.obieg.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import pl.moj.obieg.utils.DialogsUtils;

import java.io.IOException;
import java.util.Optional;
import java.util.ResourceBundle;

public class MainControllers {

    //ustawiamy jako stałe - nigby nie będą się zmieniać
    private static final String NEW_USER_FXML = "/fxml/NewUser.fxml";
    private static final String NEW_DEVICE_FXML = "/fxml/NewDevice.fxml";
    private static final String SEE_USER_FXML = "/fxml/SeeUser.fxml";
    private static final String SEE_DEVICE_FXML = "/fxml/SeeDevice.fxml";
    private static final String CHECK_USER_FXML = "/fxml/CheckUser.fxml";
    private static final String CHECK_DEVICE_FXML = "/fxml/CheckDevice.fxml";
    private static final String HARDWARE_RELASE_FXML = "/fxml/HardwareRelase.fxml";
    private static final String BLOCK_USER_FXML = "/fxml/BlockUser.fxml";
    private static final String BLOCK_DEVICE_FXML = "/fxml/BlockDevice.fxml";

    @FXML
    private BorderPane borderPane;


    @FXML
    private void initialize() {
    }

    //tworzymy formatke wciskajaca w srodek ona nowe zakladki
    public void setCenter(String fxmlPath) {
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

    @FXML
    public void newUser() {
        setCenter(NEW_USER_FXML);
    }

    @FXML
    public void newDevice() {
        setCenter(NEW_DEVICE_FXML);
    }

    @FXML
    public void seeUser() {
        setCenter(SEE_USER_FXML);
    }

    @FXML
    public void seeDevice() {
        setCenter(SEE_DEVICE_FXML);
    }

    @FXML
    public void checkUser() {
        setCenter(CHECK_USER_FXML);
    }

    @FXML
    public void checkDevice() {
        setCenter(CHECK_DEVICE_FXML);
    }

    @FXML
    public void hardwareRelease() {
        setCenter(HARDWARE_RELASE_FXML);
    }

    @FXML
    public void blockUser() {
        setCenter(BLOCK_USER_FXML);
    }

    @FXML
    public void blockDevice() {
        setCenter(BLOCK_DEVICE_FXML);
    }

    public void aboutApp() {
        DialogsUtils.dialogAbouApplication();
    }

    @FXML
    public void closeApp() {
        Optional<ButtonType> result =DialogsUtils.confirmationDialog();
        if(result.get() ==ButtonType.OK){
            Platform.exit();
        }
    }
}
