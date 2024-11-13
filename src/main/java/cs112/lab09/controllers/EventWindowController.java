package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.util.Objects;

public class EventWindowController {

    @FXML
    private Button closeButton;
    @FXML
    private Label locationLabel;
    @FXML
    private Label dateLabel;
    @FXML
    private Label descriptionLabel;
    @FXML
    private Label revisedDescriptionLabel;
    @FXML
    private Hyperlink citationHyperlink;
    @FXML
    private ImageView eventImageView;

    String location;
    RevisedHistoricalEvent event;

    public void initData(String location,RevisedHistoricalEvent event,String imagePath){
        this.location = location;
        this.event = event;
        locationLabel.setText(location);
        dateLabel.setText(event.getEventDay().toString());
        descriptionLabel.setText(event.getDescription());
        revisedDescriptionLabel.setText(event.getRevisedDescription());
        citationHyperlink.setText("via: "+event.getCitation());
        Image image = new Image(Objects.requireNonNull(getClass().getResourceAsStream(imagePath)));
        eventImageView.setImage(image);

    }




    @FXML
    protected void close(ActionEvent actionEvent){
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}
