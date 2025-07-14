package com.firebase_auth.View;

import com.firebase_auth.Controller.FireBaseAuthController;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginPage extends Application {

    FireBaseAuthController authController = new FireBaseAuthController();

    @Override
    public void start(Stage arg0) throws Exception {
        
        TextField emailField = new TextField();
        emailField.setPromptText("Enter Email");
        emailField.setMaxWidth(250);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");
        passwordField.setMaxWidth(250);

        Label resultLabel = new Label();

        Button loginButton = new Button("Login");
        loginButton.setOnAction(event -> {
            String email = emailField.getText();
            String password = passwordField.getText();
            boolean success = authController.signInWithEmailAndPassword(email, password);
            resultLabel.setText(success ? "Login Successful" : "Login failed");
        });


        VBox vBox = new VBox(10, emailField, passwordField, loginButton, resultLabel);
        vBox.setAlignment(Pos.CENTER);
        arg0.setScene( new Scene (vBox, 500, 500));
        arg0.setTitle("FireBase Authentication");
        arg0.show();
    }
    
}
