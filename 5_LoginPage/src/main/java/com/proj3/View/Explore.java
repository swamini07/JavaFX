package com.proj3.View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Explore {

    Stage explorStage;
    Scene explorScene;

    public void setExplorStage(Stage explorStage) {
        this.explorStage = explorStage;
    }

    public void setExplorScene(Scene explorScene) {
        this.explorScene = explorScene;
    }

    public VBox createscene2(Runnable back) {

        Text t1 = new Text("Hello !!");
        
        Button backbButton = new Button("Back");
        backbButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
            
        });
        VBox vb = new VBox(20, t1, backbButton);
        vb.setAlignment(Pos.CENTER);
        return vb;
    }
}
