package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.Objects;

public class Controller {

    @FXML
    private TextField name;

    @FXML
    private Button press;

    @FXML
    private TextField result;

    @FXML
    void initialize() {
        press.setOnAction(event -> {
            if (Objects.equals(name.getText(), "")){
                result.setText("ВВЕДІТЬ ІМ*Я У ВЕРХНЬОМУ РЯДКУ");
            }
            else { result.setText("Привіт, " + name.getText());

            }
        });


    }

}
