/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.controllers;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;



public class NewUserController {

    String name;

    @FXML
    private Button addUserButton;

    @FXML
    private TextField nameTextField;

    @FXML
    private TextField lastNameTextFIeld;

    @FXML
    private ComboBox sectionComboBox;

    @FXML
    private ComboBox<String> isActiveComboBox;

    @FXML
    public void addUser( ){
        addUserButton.setOnAction(action ->{
            getNameTextField();
        });
        addUserButton.setOnAction(action ->{
            getLastNameTextFIeld();
        });


        System.out.println(getNameTextField() +" "+getLastNameTextFIeld());
    }

    public String getNameTextField() {
        return nameTextField.getText();
    }

    public String getLastNameTextFIeld() {
        return lastNameTextFIeld.getText();
    }
}
