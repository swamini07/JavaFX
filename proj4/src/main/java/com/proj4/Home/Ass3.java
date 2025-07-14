package com.proj4.Home;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ass3 {
    
    Stage a3Stage;
    Scene a3Scene ;

    public void setA3Stage(Stage a3Stage) {
        this.a3Stage = a3Stage;
    }
    public void setA3Scene(Scene a3Scene) {
        this.a3Scene = a3Scene;
    }

    public VBox createScene (Runnable sta) {
        
        Text t1 = new Text("Password");
        
        PasswordField passField = new PasswordField();
        passField.setPromptText("Enter Password");
        passField.maxWidth(150);

        Text user = new Text();

        Button submit = new Button("Submit");
        submit.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                user.setText(passField.getText());
                System.out.println(user);
            }
        });

        VBox vb = new VBox(10, t1, passField, submit, user);
        vb.setAlignment(Pos.CENTER);
        return vb;
    }
}