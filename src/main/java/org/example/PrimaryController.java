package org.example;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Polyline;

public class PrimaryController {



    public Polyline polyline;
    public Button knap;

    @FXML
    public void buttonPressed() {

        System.out.println("Du har trykket på mig :D");


    }


    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
