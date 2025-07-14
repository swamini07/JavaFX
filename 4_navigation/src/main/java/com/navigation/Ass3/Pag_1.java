package com.navigation.Ass3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pag_1 extends Application{

    Stage primaryStage;
    Scene p1Scene, p2Scene;

    @Override
    public void start(Stage arg0) throws Exception {
        
        Button b1 = new Button("Next Page");
        b1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNext();
                primaryStage.setScene(p2Scene);
            }
            
        });
        VBox vb = new VBox(b1);
        vb.setAlignment(Pos.CENTER);
        Scene sc = new Scene(vb, 700, 700);
        arg0.setScene(sc);
        p1Scene = sc;
        primaryStage = arg0;
        arg0.show();
    }    

    private void initializeNext () {
        Pag_2 p2 = new Pag_2();
        p2.setP2Scene(p2Scene);
        p2Scene = new Scene (p2.createScene(this::handleBack), 700, 700);
        p2.setP2Stage(primaryStage);
    }

    private void handleBack () {
        primaryStage.setScene(p1Scene);
    }

}