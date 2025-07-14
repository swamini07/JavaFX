// package com.navigation.Home;

// import javafx.application.Application;
// import javafx.event.ActionEvent;
// import javafx.event.EventHandler;
// import javafx.geometry.Pos;
// import javafx.scene.Scene;
// import javafx.scene.control.Button;
// import javafx.scene.layout.VBox;
// import javafx.scene.text.Text;
// import javafx.stage.Stage;

// public class Login extends Application{

//     Stage primaryStage;
//     Scene page1Scene, page2Scene;

//     @Override
//     public void start(Stage arg0) throws Exception {


//         Text name = new Text("UserName");

//         Button nextBtn = new Button("Next");
//         nextBtn.setOnAction(new EventHandler<ActionEvent>() {

//             @Override
//             public void handle(ActionEvent arg0) {
//                 initializePage2();
//             }

//         });

//         VBox vBox = new VBox(20, name, nextBtn);
//         vBox.setAlignment(Pos.CENTER);

//         Scene sc = new Scene(vBox, 500, 500);
//         arg0.setScene(sc);
//         arg0.show();
//     }

//     private void initializePage2() {
//         Next n = new Next();
//         n.setStage(primaryStage);
//         page2Scene = new Scene(n.createScene(this::handleNextButton), 500, 500);
//         n.setScene(page2Scene);
//     }

//     private void handleNextButton () {
//         primaryStage.setScene(page2Scene);
//     }
// }