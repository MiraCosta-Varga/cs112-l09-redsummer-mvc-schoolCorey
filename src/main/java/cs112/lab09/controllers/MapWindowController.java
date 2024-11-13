package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class MapWindowController {

    @FXML
    private Button sanfranciscoCaButton;

    @FXML
    private Button bisbeeAzButton;

    @FXML
    protected void onBisbeeButtonClick(ActionEvent actionEvent) throws IOException {
        System.out.println("bisbee clicked");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-window.fxml"));
        Parent eventViewParent = loader.load();

        //Bisbee data
        EventWindowController eventWindowController = loader.getController();
        RevisedHistoricalEvent event = new RevisedHistoricalEvent("Original description of Bisbee, Arizona event",new Date(7,13,1919),"Revised description of Bisbee, Arizona event","Source for arizona event");
        eventWindowController.initData("Bisbee, AZ",event,"/images/bisbee.png");


        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(eventViewParent));
        stage.setResizable(false);
        stage.show();
    }
    @FXML
    protected void onSanFranciscoButtonClick(ActionEvent actionEvent) throws IOException{
        System.out.println("San Fran clicked");

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-window.fxml"));
        Parent eventViewParent = loader.load();

        //San Fan data
        EventWindowController eventWindowController = loader.getController();
        RevisedHistoricalEvent event = new RevisedHistoricalEvent("Original description of San Francisco, California event",new Date(5,15,1919),"Revised description of San Francico, California event","Source for california event");

        eventWindowController.initData("San Francisco, CA",event,"/images/sanfrancisco.jpg");


        //creates popup
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(new Scene(eventViewParent));
        stage.setResizable(false);
        stage.show();
    }


}
