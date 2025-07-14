package com.proj4.Home;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ass6 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        
        final String str1 = "Core2web";
        final String str2 = "1234";

        TextField userField = new TextField();
        userField.setFocusTraversable(false);
        userField.setPromptText("Enter Username");
        userField.setMaxWidth(250);

        PasswordField passField = new PasswordField();
        passField.setPromptText("Enter password");
        passField.setMaxWidth(250);
        passField.setFocusTraversable(false);
        
        Text t1Text = new Text();

        Button submit = new Button("Submit");
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String str = userField.getText();
                String strr = passField.getText();

                if (str.equals(str1) && strr.equals(str2)) {
                    t1Text.setText("Welcome To JavaFx");
                } else {
                    t1Text.setText("Invalid Input !!");
                }
            }
            
        });
        
        VBox vBox = new VBox(20, userField, passField, submit, t1Text);
        vBox.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vBox, 500, 500);
        arg0.setScene(sc);
        arg0.show();
    }
    
}