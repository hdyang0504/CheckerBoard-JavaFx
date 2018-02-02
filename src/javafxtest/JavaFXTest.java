/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxtest;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author hdyang
 */
public class JavaFXTest extends Application {
    private double stageWidth = 0;
    private double stageHeight = 0;
    public int numRect = 0;
    public void drawRect(){

    }
    @Override
    public void start(Stage stage) {
        numRect = 16;
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/javafxtest/test.fxml"));

            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setTitle("JavaFX Demo");
            
            stageHeight = stage.getHeight();
            stageWidth = stage.getWidth();
            double rectWidth = stageWidth / numRect;
            double rectHeight = stageHeight / numRect;
            double rectPointX = 0;
            double rectPointY = 0;
            Group groupRects = new Group();
            for(int i = 0; i < numRect; i++) {
                for(int j = 0; j < numRect; j++) {
                    Rectangle rect = new Rectangle(rectPointX, rectPointY, rectWidth, rectHeight);
                    rectPointX += rectWidth;
                    groupRects.getChildren().add(rect);
                }
                rectPointY += rectHeight;
            }
            root.getChildren().add(groupRects);
                    
                    
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(JavaFXTest.class.getName()).log(Level.SEVERE, null, ex);
        }
//        Button btn = new Button();
//        btn.setText("Say 'Hello World'");
//        btn.setOnAction(new EventHandler<ActionEvent>() {
//            
//            @Override
//            public void handle(ActionEvent event) {
//                System.out.println("Hello World!");
//            }
//        });
//        
//        StackPane root = new StackPane();
//        root.getChildren().add(btn);
//        
//        Scene scene = new Scene(root, 300, 250);
//        
//        primaryStage.setTitle("Hello World!");
//        primaryStage.setScene(scene);
//        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
