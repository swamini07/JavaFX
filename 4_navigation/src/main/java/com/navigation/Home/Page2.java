package com.navigation.Home;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page2 {

    Scene p2Scene, page2Scene, page3Scene;
    Stage p2Stage;

    public void setScene(Scene p2StaScene) {
        this.p2Scene = p2StaScene;
    }

    public void setStage(Stage p2Stage) {
        this.p2Stage = p2Stage;
    }

    public VBox createScene(Runnable back) {

        Text tx = new Text("Second Page");
        Button prvButton = new Button("Previous Page");
        prvButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
        });

        Button nextBtn2 = new Button("Next Page");
        nextBtn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializePage3();
                p2Stage.setScene(page3Scene);
            }

        });

        VBox vb = new VBox(50, tx, prvButton, nextBtn2);
        vb.setStyle("-fx-alignment : top-center");
        return vb;
    }

    private void initializePage3() {
        Page3 page3 = new Page3();
        page3.setP3Stage(p2Stage);
        page3Scene = new Scene(page3.createScene2(this::handleNextButton), 500, 500);
        page3.setP3Scene(page3Scene);
    }

    private void handleNextButton() {
        p2Stage.setScene(page2Scene);
    }
}
