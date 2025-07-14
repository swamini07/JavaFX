package com.apibinding.View;

import com.apibinding.Controller.APIController;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HomePage extends Application {

    public void start(Stage stage) {
        
        Label title = new Label("API Binding");
        
        TextField input = new TextField("football");
        
        Button button = new Button("Get Image");
        
        ImageView imageView = new ImageView();
        imageView.setFitWidth(500);
        imageView.setPreserveRatio(true);

        button.setOnAction(e -> {
            String keyword = input.getText();
            String imageUrl = APIController.getImageUrl(keyword);
            if (imageUrl != null) {
                imageView.setImage(new Image(imageUrl));
            }
        });

        VBox root = new VBox(10, title, input, button, imageView);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");
        Scene scene = new Scene(root, 800, 600);
        stage.setScene(scene);
        stage.setTitle("Unsplash Image Viewer");
        stage.show();
    }
}
