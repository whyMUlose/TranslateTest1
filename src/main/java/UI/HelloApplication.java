package UI;

import Manager.SceneManager;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class HelloApplication  {

    @FXML
    private AnchorPane HomePane;
    @FXML
    public void switchToTranslator(ActionEvent event) throws IOException {
        SceneManager.getIns(SceneManager.class).openScene(HomePane,"Translator.fxml");
    }
    public void switchToAddWord(ActionEvent event) throws IOException {
        SceneManager.getIns(SceneManager.class).openScene(HomePane,"AddWord.fxml");
    }
    public void switchToLookUpWord(ActionEvent event) throws IOException {
        SceneManager.getIns(SceneManager.class).openScene(HomePane,"LookUpWord.fxml");
    }
}