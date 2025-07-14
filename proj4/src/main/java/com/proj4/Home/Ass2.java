package com.proj4.Home;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ass2 extends Application {

    Stage primaryStage;
    Scene currentScene, nextScene ;

    @Override
    public void start(Stage arg0) throws Exception {

        TextField tf1 = new TextField();
        tf1.setPromptText("Enter any Number");
        tf1.setMaxWidth(250);
        tf1.setFocusTraversable(false);

        Text t1 = new Text();

        Button square = new Button("Square");
        square.setMaxWidth(150);
        square.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                double num = Double.parseDouble(tf1.getText());
                double square = num * num;
                t1.setText("Square = " + square);
            }
        });

        Button cube = new Button("Cube");
        cube.setMaxWidth(150);
        cube.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                double num = Double.parseDouble(tf1.getText());
                double cube = num * num * num;
                t1.setText("Cube = " + cube);
            }
        });

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Addition", "Subtraction", "Multiplication", "Division");
        choiceBox.setValue("Operations");

        Text result = new Text();

        TextField tf2 = new TextField();
        tf2.setMaxWidth(250);
        tf2.setPromptText("Enter number");

        Button calculate = new Button("Calculate");
        calculate.setFocusTraversable(false);
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent arg0) {
                double num1 = Double.parseDouble(tf1.getText());
                double num2 = Double.parseDouble(tf2.getText());
                String choice = choiceBox.getValue();
                double res = 0;

                if (choice.equals("Addition")) {
                    res = num1 + num2;
                } else if (choice.equals("Subtraction")) {
                    res = num1 - num2;
                } else if (choice.equals("Multiplication")) {
                    res = num1 * num2;
                } else if (choice.equals("Division")){
                    res = num1 / num2;
                }
                result.setText(choice + " of " + num1 + " " + choice + " " + num2 +  "=" + res);
            }
        });

        Button next = new Button("Next");
        next.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                initializenext();
                primaryStage.setScene(nextScene);
            }
            
        });

        VBox vBox = new VBox(10, tf1, square, cube, t1);
        vBox.setPadding(new Insets(20));
        vBox.setAlignment(Pos.CENTER);

        Scene sc = new Scene(vBox, 800, 500);
        arg0.setScene(sc);
        currentScene = sc;
        primaryStage = arg0;
        arg0.show();
        
    }

    private void initializenext() {
        Ass3 a3 = new Ass3();
        a3.setA3Stage(primaryStage);
        nextScene = new Scene(a3.createScene(this::nextpageButton), 500, 500);
        a3.setA3Scene(nextScene);;
    }

    private void nextpageButton () {
        primaryStage.setScene(currentScene);
    }
}