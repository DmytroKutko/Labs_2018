package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
public class Controller {

    @FXML
    private TextArea textArea1,textArea2;

    @FXML
    private Button code,uncode;

    public void onClickMethodCode(ActionEvent actionEvent) {
        String s = textArea1.getText();
        textArea2.setText(s + " + key");
    }
}
