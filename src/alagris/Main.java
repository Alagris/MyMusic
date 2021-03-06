package alagris;
/**
 * Created by alagris on 28/04/2017.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
            stage.setTitle("FXML Welcome");
            stage.setScene(new Scene(root, 600, 475));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
