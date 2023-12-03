package AlertDisplay;

import javafx.scene.control.Alert;

public class WinWordleGameAlert implements CustomAlert{
    @Override
    public void displayAlert(String wordToDisplay) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("YOU WIN!");
        alert.setContentText(wordToDisplay);
        alert.setHeaderText("The correct word is:");
        alert.showAndWait();
    }
}
