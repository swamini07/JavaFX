package com.proj3.View;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application {

    Stage primaryStage;
    Scene loginScene, homScene, explorScene;
    String s2;

    @Override
    public void start(Stage arg0) throws Exception {
        
        Text t = new Text();

        ImageView image = new ImageView("Assets\\core2web.jpg");
        image.setFitHeight(200);
        image.setFitWidth(200);

        Text t1 = new Text("Welcome to Core2Web");

        VBox v1 = new VBox(image, t1);
        v1.setAlignment(Pos.CENTER);

        Text t2 = new Text("                                                                    UserName");
        VBox v2 = new VBox(t2);
        // v2.setMaxSize(10, 50);
        // v2.setAlignment(Pos.CENTER_LEFT);

        TextField userField = new TextField();
        userField.setMaxWidth(250);
        userField.setStyle("-fx-max-height : 250");

        Text t3 = new Text("                                                                      Password");
        VBox v3 = new VBox(t3);
        v3.setAlignment(Pos.CENTER_LEFT);

        t3.setStyle("-fx-alignment : top-left");
        PasswordField passwordField = new PasswordField();
        passwordField.setMaxWidth(250);

        Button loginButton = new Button("Login");
        loginButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {               
            
                    initializeHomePage();
                primaryStage.setScene(homScene);
            
                
            }

        });
        Button exploreButton = new Button("Explore");
        exploreButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeExplore();
                primaryStage.setScene(homScene);
            }
        });

        VBox vBox = new VBox(20, v1, v2, userField, v3, passwordField, loginButton, exploreButton);
        vBox.setAlignment(Pos.CENTER);
        // vBox.setStyle("-fx-background-color : BLACK");

        Scene sc = new Scene(vBox, 700, 700);
        arg0.setScene(sc);
        loginScene = sc;
        primaryStage = arg0;
        arg0.show();
    }

    private void initializeHomePage() {
        Home home = new Home();
        home.setHomeStage(primaryStage);
        homScene = new Scene(home.createScene(this::handleBackButton), 700, 700);
    }

    private void handleBackButton() {
        primaryStage.setScene(loginScene);
    }

    private void initializeExplore() {
        Explore explore = new Explore();
        explore.setExplorStage(primaryStage);
        explorScene = new Scene(explore.createscene2(this::handleBackButton2), 700, 700);
        explore.setExplorScene(explorScene);

    }

    private void handleBackButton2() {
        primaryStage.setScene(loginScene);
    }
}
