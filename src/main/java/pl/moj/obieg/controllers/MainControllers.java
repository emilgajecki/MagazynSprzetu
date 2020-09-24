package pl.moj.obieg.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.ResourceBundle;


public class MainControllers {

    //ustawiamy jako stałe - nigby nie będą się zmieniać
    private static final String USER_FXML = "/fxml/NewUser.fxml";

    @FXML
    private BorderPane borderPane;


    @FXML
    private void initialize() {
    }

    //tworzymy formatke wciskajaca w srodek ona nowe zakladki
    public void setCenter(String fxmlPath) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getClassLoader().getResource(fxmlPath));
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
        setCenter(USER_FXML);
    }

    @FXML
    public void newDevice() {
        System.out.println("newDevice");
    }

    @FXML
    public void seeUser() {
        System.out.println("seeUser");
    }

    @FXML
    public void seeDevice() {
        System.out.println("seeDevice");
    }

    @FXML
    public void checkUser() {
        System.out.println("checkUser");
    }

    @FXML
    public void checkDevice() {
        System.out.println("checkDevice");
    }

    @FXML
    public void hardwareRelease() {
        System.out.println("hardwareRelease");
    }

    @FXML
    public void blockUser() {
        System.out.println("blockUser");
    }

    @FXML
    public void blockDevice() {
        System.out.println("blockDevice");
    }

    @FXML
    public void closeApp() {
        Platform.exit();
    }

}
