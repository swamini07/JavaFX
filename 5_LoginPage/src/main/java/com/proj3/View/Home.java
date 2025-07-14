package com.proj3.View;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Home {
    Stage homeStage;
    Scene homScene, explorScene;

    public void setHomeStage(Stage homeStage) {
        this.homeStage = homeStage;
    }

    public void setHomScene(Scene homScene) {
        this.homScene = homScene;
    }

    public VBox createScene(Runnable back) {

        Text t1 = new Text("Welcome to Core2web");
        Button exploreButton = new Button("Explore");
        exploreButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializeExplore();
                homeStage.setScene(explorScene);
            }

        });

        Button backButton = new Button("Back");
        backButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                System.out.println("back !!");         

                initializeExplore();
                homeStage.setScene(explorScene);   
                System.out.println("back !!");         
            }

        });

        VBox vBox = new VBox(20, t1, exploreButton, backButton);
        vBox.setAlignment(Pos.CENTER);
        return vBox;
    }


    private void initializeExplore() {
        Explore explore = new Explore();
        explore.setExplorStage(homeStage);
        explorScene = new Scene(explore.createscene2(this::handleBackButton), 700, 700);

    }

    private void handleBackButton() {
        homeStage.setScene(homScene);

    }
}
