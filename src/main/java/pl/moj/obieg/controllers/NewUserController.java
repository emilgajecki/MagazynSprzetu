/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class NewUserController {

    @FXML
    private Button addUser;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField lastNameTextFIeld;

    @FXML
    private ComboBox<String> sectionComboBox;

    @FXML ComboBox<String> isActiveComboBox;


    public void addUser() {
    }
}
