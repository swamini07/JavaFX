package com.example.Home;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Home extends Application {

    @Override
    public void start(Stage myStage) throws Exception {

        DropShadow dropShadow = new DropShadow();
        dropShadow.setColor(Color.YELLOW);
        Text t1 = new Text(700, 20, "Good Morning");
        t1.setFont(new Font(30));
        t1.setEffect(dropShadow);
        t1.setStyle("-fx-stroke: black");
        t1.setFill(Color.MAROON);

        VBox vb = new VBox(10);
        Image image = new Image("Assets\\Images\\javaLogo.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitWidth(100);
        imageView.setPreserveRatio(true);
        vb.getChildren().addAll(imageView);
        vb.setVisible(true);

        Text t2 = new Text(200, 30, "Have a nice day");
        t1.setFill(Color.YELLOW);
        t2.setFont(new Font(30));                                                                                            

        VBox vb2 = new VBox(15, t1, t2);
        HBox hb = new HBox(50, vb, vb2);

        // Group gr = new Group(t1, t2);

        Scene myScene = new Scene(hb, 100, 800);

        // myScene.setFill(Color.MAROON);
        myStage.setTitle("New Project");
        myStage.setWidth(1000);
        myStage.setHeight(600);
        myStage.setResizable(true);
        myStage.getIcons().add(new Image("Assets\\Images\\javaLogo.png"));
        myStage.setScene(myScene);
        myStage.show();
    }
}