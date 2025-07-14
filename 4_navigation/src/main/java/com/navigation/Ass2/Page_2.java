package com.navigation.Ass2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page_2 {

    Stage p2Stage;
    Scene p2Scene, p3Scene;

    public void setP2Stage(Stage p2Stage) {
        this.p2Stage = p2Stage;
    }

    public void setP2Scene(Scene p2Scene) {
        this.p2Scene = p2Scene;
    }

    public VBox createScene(Runnable back) {

        Text tx = new Text("Next Page");
        Button prvButton = new Button("Previous Page");
        prvButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                back.run();
            }
        });

        VBox vb = new VBox(50, tx, prvButton);
        vb.setStyle("-fx-alignment : center");
        return vb;
    }

    // // private void initializePage3() {
    // //     Page_3 p3 = new Page_3();
    // //     p3.setP3Stage(p2Stage);
    // //     p3Scene = new Scene(p3.createScene(this::handleNextButton2), 700, 700);
    // //     p3.setP3Sscene(p3Scene);

    // // }

    // private void handleNextButton2 () {
    //     p2Stage.setScene(p3Scene);
    // }
}
