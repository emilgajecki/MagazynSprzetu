package pl.moj.obieg;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.moj.obieg.database.dbutils.DbManager;

import java.util.ResourceBundle;


public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // ladujemy okno za pomoca FXML loadera
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainScreen.fxml"));
        // w celu ustandaryzowania programu(rozne jezyki uzywamy Resource
        ResourceBundle bundle = ResourceBundle.getBundle("bundles.messages");
        // zaczytujemy wiadomosci
        loader.setResources(bundle);
        BorderPane borderPane = loader.load();
        Scene scene = new Scene(borderPane);
        primaryStage.setMaximized(true);
        primaryStage.setScene(scene);
        // w tytyle podajemy miejsce, z którego ma pobrac nazwe
        primaryStage.setTitle(bundle.getString("title.application"));
        primaryStage.show();
        //inicjalizujemy polaczenie z baza danych
        DbManager.initDatabase();
    }

}
