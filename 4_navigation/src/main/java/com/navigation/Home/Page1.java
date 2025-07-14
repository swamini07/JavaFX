package com.navigation.Home;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page1 extends Application {

    Scene page1Scene, page2Scene;
    Stage primarStage;

    @Override
    public void start(Stage arg0) throws Exception {
        
        Text tx = new Text("First Page");
        Button nextBtn = new Button("Next Page");
        nextBtn.setOnAction(new EventHandler<ActionEvent>() {

        @Override
            public void handle(ActionEvent arg0) {
                initializePage2();
                primarStage.setScene(page2Scene);
            }

        });

        VBox vb = new VBox(50, tx, nextBtn);
        vb.setAlignment(Pos.CENTER);
        Scene sc = new Scene(vb, 800, 500);
        arg0.setScene(sc);
        page1Scene = sc;
        primarStage = arg0;
        arg0.show();
    }

    private void initializePage2() {
        Page2 page2 = new Page2();
        page2.setStage(primarStage);
        page2Scene = new Scene(page2.createScene(this::handleBackButton), 500, 500);
        page2.setScene(page2Scene);
    }

    private void handleBackButton() {
        primarStage.setScene(page1Scene);
    }

}
