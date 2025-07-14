package com.navigation.Ass3;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Pag_3 {

    public void setP3Stage(Stage p3Stage) {
        this.p3Stage = p3Stage;
    }

    public void setP3Scene(Scene p3Scene) {
        this.p3Scene = p3Scene;
    }

    Stage p3Stage;
    Scene p1Scene, p3Scene;

    public VBox createVBox(Runnable back) {
        Button home = new Button("Back to Home");
        home.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                // initializeNext();
                // p3Stage.setScene(p1Scene);
                back.run();
            }

        });
        VBox vb = new VBox(home);
        vb.setAlignment(Pos.CENTER);
        return vb;
    }
}
