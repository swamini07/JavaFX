package com.navigation.Home;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class Page3 {

    Stage p3Stage;
    Scene p3Scene, page3Scene, page4Scene;
    String username;

    public void setP3Stage(Stage p3Stage) {
        this.p3Stage = p3Stage;
    }

    public void setP3Scene(Scene p3Scene) {
        this.p3Scene = p3Scene;
    }

    Text name = new Text();
    Text user = new Text();

    public VBox createScene2(Runnable next) {
        Text tx = new Text("Welcome");
        tx.setStyle("-fx-stroke: bold;");

        Text tx1 = new Text("UserName : ");
        TextField userField = new TextField();

        HBox hBox1 = new HBox(20, tx1, userField);

        Text tx2 = new Text("Password : ");
        PasswordField passworField = new PasswordField();
        HBox hBox2 = new HBox(20, tx2, passworField);

        Button signIn = new Button("Sign in");
        signIn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                username = userField.getText();
                initializePage4();
                p3Stage.setScene(page4Scene);
                name.setText(userField.getText());
            }
        });

        VBox vBox = new VBox(20, tx, hBox1, hBox2, signIn,user);
        vBox.setPadding(new Insets(20));
        return vBox;


    }

    private void initializePage4() {
        Page4 page4 = new Page4(username);
        page4.setP4Scene(p3Scene);
        page4Scene = new Scene(page4.createScene3(this::handleNextButton), 700, 700);
        page4.setP4Scene(page3Scene);

    }
    private void handleNextButton () {
        p3Stage.setScene(page3Scene);
    }
}
