/*
 * @ author : Emil Gajęcki
 * @ github: https://github.com/emilgajecki
 * @ linkedin : https://linkedin.com/in/emil-gajecki
 */

package pl.moj.obieg.dialogs;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;
import java.util.ResourceBundle;

public class DialogsUtils {

    static ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");

    public static void dialogAbouApplication() {
        Alert information = new Alert(Alert.AlertType.INFORMATION);
        information.setTitle(bundle.getString("about.title"));
        information.setHeaderText(bundle.getString("about.header"));
        information.setContentText(bundle.getString("about.centent"));
        information.showAndWait();
    }

    //potwierdzanie i wyjscie z aplikacji
    public static Optional<ButtonType> confirmationDialog(){
        Alert confirmationDialog = new Alert(Alert.AlertType.CONFIRMATION);
        confirmationDialog.setTitle(bundle.getString("exit.title"));
        confirmationDialog.setHeaderText(bundle.getString("exit.header"));
        Optional<ButtonType> result =confirmationDialog.showAndWait();
        return result;

    }
}

