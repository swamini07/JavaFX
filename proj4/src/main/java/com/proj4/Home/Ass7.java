package com.proj4.Home;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ass7 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {

        TextField tf = new TextField();
        tf.setMaxWidth(250);
        tf.setPromptText("Enter value");

        Button button = new Button(" Check ");
        Label l1 =  new Label();

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String input = tf.getText();
                String reverse = new StringBuilder(input).reverse().toString();

                if (input.equalsIgnoreCase(reverse)) {
                    l1.setText("Yes, Palindrome");                    
                } else {
                    l1.setText("No, not a palindrome ..!!");
                }
            }            
        });

        VBox  vBox = new VBox(20, tf, button, l1);
        vBox.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vBox, 500, 500);
        arg0.setScene(scene);
        arg0.show();
    }
    
}
