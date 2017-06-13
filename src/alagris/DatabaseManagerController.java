/**
 * Sample Skeleton for 'databaseManager.fxml' Controller Class
 */

package alagris;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;

public class DatabaseManagerController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="moveAllToLeft"
    private Button moveAllToLeft; // Value injected by FXMLLoader

    @FXML // fx:id="leftList"
    private ListView<?> leftList; // Value injected by FXMLLoader

    @FXML // fx:id="clearLeft"
    private Button clearLeft; // Value injected by FXMLLoader

    @FXML // fx:id="rightList"
    private ListView<?> rightList; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert moveAllToLeft != null : "fx:id=\"moveAllToLeft\" was not injected: check your FXML file 'databaseManager.fxml'.";
        assert leftList != null : "fx:id=\"leftList\" was not injected: check your FXML file 'databaseManager.fxml'.";
        assert clearLeft != null : "fx:id=\"clearLeft\" was not injected: check your FXML file 'databaseManager.fxml'.";
        assert rightList != null : "fx:id=\"rightList\" was not injected: check your FXML file 'databaseManager.fxml'.";

    }
}
