package com.navigation.Home;

import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Page4 {

    Stage p4Stage;
    Scene p4Scene, page4Scene;
    String userName1;

    Page4(String userName1){
        System.out.println("ksbjsbuxs");
        this.userName1 = userName1;

    }
    
    public void setP4Stage(Stage p4Stage) {
        this.p4Stage = p4Stage;
    }

    public void setP4Scene(Scene p4Scene) {
        this.p4Scene = p4Scene;
    }

    public VBox createScene3(Runnable next) {
        
        System.out.println("sdadd"+userName1);
        Text t1 = new Text("Welcome: " + userName1);
        VBox vBox = new VBox(t1);
        return vBox;

    }

}
