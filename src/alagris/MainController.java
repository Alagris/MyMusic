/**
 * Sample Skeleton for 'main.fxml' Controller Class
 */

package alagris;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="generateButton"
    private Button generateButton; // Value injected by FXMLLoader

    @FXML // fx:id="songCollaboratorsField"
    private TextField songCollaboratorsField; // Value injected by FXMLLoader

    @FXML // fx:id="songListView"
    private ListView<?> songListView; // Value injected by FXMLLoader

    @FXML // fx:id="songDescriptionEditButton"
    private Button songDescriptionEditButton; // Value injected by FXMLLoader

    @FXML // fx:id="playButton"
    private Button playButton; // Value injected by FXMLLoader

    @FXML // fx:id="nextButton"
    private Button nextButton; // Value injected by FXMLLoader

    @FXML // fx:id="songSourceField"
    private TextField songSourceField; // Value injected by FXMLLoader

    @FXML // fx:id="songTitleField"
    private TextField songTitleField; // Value injected by FXMLLoader

    @FXML // fx:id="videoClipSlider"
    private Slider videoClipSlider; // Value injected by FXMLLoader

    @FXML // fx:id="playlistComboBox"
    private ComboBox<?> playlistComboBox; // Value injected by FXMLLoader

    @FXML // fx:id="mediaView"
    private MediaView mediaView; // Value injected by FXMLLoader

    @FXML // fx:id="songDateField"
    private TextField songDateField; // Value injected by FXMLLoader

    @FXML // fx:id="loopButton"
    private Button loopButton; // Value injected by FXMLLoader

    @FXML // fx:id="songAuthorField"
    private TextField songAuthorField; // Value injected by FXMLLoader

    @FXML
    void importFromYoutube(ActionEvent event) {

    }

    @FXML
    void importFromFile(ActionEvent event) {
    	
    }



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert generateButton != null : "fx:id=\"generateButton\" was not injected: check your FXML file 'main.fxml'.";
        assert songCollaboratorsField != null : "fx:id=\"songCollaboratorsField\" was not injected: check your FXML file 'main.fxml'.";
        assert songListView != null : "fx:id=\"songListView\" was not injected: check your FXML file 'main.fxml'.";
        assert songDescriptionEditButton != null : "fx:id=\"songDescriptionEditButton\" was not injected: check your FXML file 'main.fxml'.";
        assert playButton != null : "fx:id=\"playButton\" was not injected: check your FXML file 'main.fxml'.";
        assert nextButton != null : "fx:id=\"nextButton\" was not injected: check your FXML file 'main.fxml'.";
        assert songSourceField != null : "fx:id=\"songSourceField\" was not injected: check your FXML file 'main.fxml'.";
        assert songTitleField != null : "fx:id=\"songTitleField\" was not injected: check your FXML file 'main.fxml'.";
        assert playlistComboBox != null : "fx:id=\"playlistComboBox\" was not injected: check your FXML file 'main.fxml'.";
        assert mediaView != null : "fx:id=\"mediaView\" was not injected: check your FXML file 'main.fxml'.";
        assert songDateField != null : "fx:id=\"songDateField\" was not injected: check your FXML file 'main.fxml'.";
        assert loopButton != null : "fx:id=\"loopButton\" was not injected: check your FXML file 'main.fxml'.";
        assert songAuthorField != null : "fx:id=\"songAuthorField\" was not injected: check your FXML file 'main.fxml'.";
		try {
			URI uri = new URI("file:///Users/alagris/Desktop/2017-06-10_17_52_24.mp4");//new URI("/Users/alagris/Documents/my/res/image/wallpapers/239047.png").toString()
			Media media = new Media(uri.toASCIIString());
			MediaPlayer mediaPlayer = new MediaPlayer(media);
		    mediaView.mediaPlayerProperty().setValue(mediaPlayer);;
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
//		mediaView.mediaPlayerProperty().get().play();
    }
}
