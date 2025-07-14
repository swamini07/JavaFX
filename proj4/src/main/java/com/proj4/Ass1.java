package com.proj4;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ass1 extends Application {

    @Override
    public void start(Stage arg0) throws Exception {

        Text name = new Text();
        Text userName = new Text("username");

        TextField t1 = new TextField();
        t1.setPromptText("Enter Your Name");
        t1.maxWidth(250);
    
        t1.setFocusTraversable(false);

        Button submit = new Button("Submit");
        submit.setStyle("-fx-background-color: skyblue");
        submit.setMaxWidth(150);
        submit.setFocusTraversable(false);
        submit.setOnAction(new javafx.event.EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                name.setText(t1.getText());
                System.out.println(name);
            }

        });
        VBox vBox = new VBox(10, userName, t1, submit, name);
        vBox.setStyle("-fx-background-color: YELLOW");
        vBox.setPadding(new Insets(20));
        Scene myScene = new Scene(vBox, 500, 500);
        Stage myStage = new Stage();
        myStage.setScene(myScene);
        myStage.show();
    }

}
