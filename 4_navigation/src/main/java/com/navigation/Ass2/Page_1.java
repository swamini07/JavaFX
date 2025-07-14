package com.navigation.Ass2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Page_1 extends Application{

    Stage primaryStage;
    Scene p1Scene, p2Scene;

    @Override
    public void start(Stage arg0) throws Exception {
        
        Button b1 = new Button("Button 1");
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNextPage();
                primaryStage.setScene(p2Scene);
            }
        });
        
        Button b2 = new Button("Button 2");
        b2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNextPage();
                primaryStage.setScene(p2Scene);
            }
            
        });        
        
        Button b3 = new Button("Button 3");   
        b3.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNextPage();
                primaryStage.setScene(p2Scene);
            }
            
        });     
        Button b4 = new Button("Button 4");
        b4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNextPage();
                primaryStage.setScene(p2Scene);
            }
            
        });

        Button b5 = new Button("Button 5");
        b4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNextPage();
                primaryStage.setScene(p2Scene);
            }
            
        });

        VBox vBox = new VBox(20, b1, b2, b3, b4, b5);
        vBox.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vBox, 700, 700);
        arg0.setScene(sc);
        p1Scene = sc;
        primaryStage = arg0;
        arg0.show();
    }

    private void initializeNextPage() {
        Page_2 p2 = new Page_2();
        p2.setP2Stage(primaryStage);
        p2Scene = new Scene(p2.createScene(this::handleBackButton), 700, 700);
        p2.setP2Scene(p2Scene);
    }

    private void handleBackButton() {
        primaryStage.setScene(p1Scene);
    }
}
