package com.example.testasfrontend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ResourceBundle;

public class InsertPerson{

    private Parent root;
    private Stage stage;
    private Scene scene;

    ConnectionManager connectionManager = new ConnectionManager();

    @FXML
    private TextField TFFN;
    @FXML
    private TextField TFLN;
    @FXML
    private TextField TFDOB;
    @FXML
    private TextField TFA;
    @FXML
    private Label LDone;
    @FXML
    private Label LND;


    public void InsertButtonOnAction(ActionEvent event) {
        insert();
    }

    public void insert(){
        String firstname = URLEncoder.encode(TFFN.getText(), StandardCharsets.UTF_8);
        String lastname = URLEncoder.encode(TFLN.getText(), StandardCharsets.UTF_8);
        String dateOfBirth = URLEncoder.encode(TFDOB.getText(), StandardCharsets.UTF_8);
        String address = URLEncoder.encode(TFA.getText(), StandardCharsets.UTF_8);

        connectionManager.sendRequest("/insertPerson?firstname=" + firstname + "&lastname="+ lastname + "&dateOfBirth=" + dateOfBirth + "&address=" + address);
    }
}
