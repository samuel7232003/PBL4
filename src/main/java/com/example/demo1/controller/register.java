package com.example.demo1.controller;

import com.example.demo1.index;
import com.example.demo1.model.User;
import com.example.demo1.service.impl.UserService;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class register {
    @FXML
    private Label hello;
    @FXML
    private TextField fullnametxt;
    @FXML
    private TextField usernametxt;
    @FXML
    private TextField pwd;
    @FXML
    protected void onsubmitClick() throws IOException {
        hello.setText("Nhan duoc ne");
        String username = usernametxt.getText();
        String password = pwd.getText();
        String fullname = fullnametxt.getText();
        User user = new User();
        user = UserService.getInstance().register(username, password, fullname);
        Stage stage = new Stage();
        start_chat_view(stage);
    }
    public void start_chat_view(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(index.class.getResource("chat-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);
        //scene.getStylesheets().add(getClass().getResource("app.css").toExternalForm());
        stage.setScene(scene);
        stage.setTitle("Chat!");
        stage.show();
    }
}
