package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {
    @FXML
    private Label welcomeText;


    @FXML
    public void onStartButtonClick(ActionEvent actionEvent) throws IOException {

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("/cs112/lab09/map-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 850, 651);
        stage.setTitle("Revisionist History Map");
        stage.setScene(scene);
        stage.show();

    }

    @FXML
    protected void onQuitButtonClick(ActionEvent actionEvent) {
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}