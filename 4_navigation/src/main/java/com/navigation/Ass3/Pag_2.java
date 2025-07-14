package com.navigation.Ass3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pag_2 {

    Stage p2Stage;
    Scene p2Scene, p3Scene;
    public void setP2Stage(Stage p2Stage) {
        this.p2Stage = p2Stage;
    }
    public void setP2Scene(Scene p2Scene) {
        this.p2Scene = p2Scene;
    }
    public VBox createScene(Runnable back) {
        
        Button nextButton = new Button("Next");
        nextButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeNext();
                p2Stage.setScene(p3Scene);
            }
            
        });

        Button backButton = new Button("Previous");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
            
        });
        VBox vb = new VBox(30, nextButton, backButton);
        vb.setAlignment(Pos.CENTER);
        return vb;
    }

    private void initializeNext () {
        Pag_3 p3 = new Pag_3();
        p3.setP3Stage(p2Stage);
        p3Scene = new Scene(p3.createVBox(this::handleBack), 700, 700);
        p3.setP3Scene(p3Scene);
    }
    private void handleBack() {
        p2Stage.setScene(p2Scene);

    }
    
}
