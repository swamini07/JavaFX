package com.proj4.Home;

import javax.imageio.plugins.bmp.BMPImageWriteParam;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Ass8 extends Application{

    final String[] colors = {"YELLOW", "GREEN", "RED", "BLUE"};
    int index = 0;

    @Override
    public void start(Stage arg0) throws Exception {

        Button click1 = new Button("Click me !!");

        VBox vBox = new VBox(click1);

        click1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {   
                index = (index + 1) % colors.length;  

            vBox.setStyle("-fx-background-color : " + colors[index]);

            }
            
        });

        vBox.setAlignment(Pos.CENTER);
        Scene sc = new Scene(vBox, 500, 500);
        arg0.setScene(sc);
        arg0.show();
    }
    
}
