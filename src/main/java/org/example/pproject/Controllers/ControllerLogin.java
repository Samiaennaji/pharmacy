package org.example.pproject.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ControllerLogin {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome !");
    }



}