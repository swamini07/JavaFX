package com.firestore.View;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Page1 extends Application{

    @Override
    public void start(Stage arg0) throws Exception {
        
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        TextField t3 = new TextField();

        Button add = new Button("add");
        Button read = new Button("read");
        Button update = new Button("update");
        Button delete = new Button("delete");

        VBox root = new VBox(20, t1, t2, t3, add, read, update, delete);
        root.setAlignment(Pos.CENTER);

        Scene sc = new Scene(root, 500, 500);
        arg0.setScene(sc);
        arg0.show();
    }
    
}
