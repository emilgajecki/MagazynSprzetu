package pl.moj.obieg.controllers;

import javafx.application.Platform;
import javafx.fxml.FXML;

public class MenuScreenController {

    private MainControllers mainControllers;

    public void setMainControllers(MainControllers mainControllers) {
        this.mainControllers = mainControllers;
    }

    @FXML
    public void newUser(){
        System.out.println("newUser");
    }

    @FXML
    public void newDevice(){
        System.out.println("newDevice");
    }

    public void seeUser( ) {
        System.out.println("seeUser");
    }

    public void seeDevice( ) {
        System.out.println("seeDevice");
    }

    public void checkUser( ) {
        System.out.println("checkUser");
    }

    public void checkDevice( ) {
        System.out.println("checkDevice");
    }

    public void hardwareRelease( ) {
        System.out.println("hardwareRelease");
    }

    public void blockUser( ) {
        System.out.println("blockUser");
    }

    public void blockDevice( ) {
        System.out.println("blockDevice");
    }

    public void closeApp( ) {
        Platform.exit();
    }
}
