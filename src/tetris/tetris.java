package tetris;

import java.awt.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class tetris extends Application {
    public void start(Stage primaryStage) {
        display(primaryStage);
    }

    public static Button[] createSqr(){
        Button[] sqr = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        for(int i = 0; i < 100; i++){
            sqr[i] = new Button();
        }
        return sqr;
    }

    public static VBox layout(){
        Button[] sqr = createSqr();
        VBox layout = new VBox();
        HBox row1 = new HBox();
        HBox row2 = new HBox();
        HBox row3 = new HBox();
        HBox row4 = new HBox();
        HBox row5 = new HBox();
        HBox row6 = new HBox();
        HBox row7 = new HBox();
        HBox row8 = new HBox();
        HBox row9 = new HBox();
        HBox row10 = new HBox();

        for(int i = 0; i < sqr.length; i++){
            sqr[i].setMinWidth(100.0f);
            sqr[i].setMinHeight(100.0f);
        }

        for(int i = 0; i < sqr.length; i++) {
            if(i < 10) {
                row1.getChildren().add(sqr[i]);
            }
            if(i > 9 && i < 20) {
                row2.getChildren().add(sqr[i]);
            }
            if(i > 19 && i < 30) {
                row3.getChildren().add(sqr[i]);
            }
            if(i > 29 && i < 40) {
                row4.getChildren().add(sqr[i]);
            }
            if(i > 39 && i < 50) {
                row5.getChildren().add(sqr[i]);
            }
            if(i > 49 && i < 60) {
                row6.getChildren().add(sqr[i]);
            }
            if(i > 59 && i < 70) {
                row7.getChildren().add(sqr[i]);
            }
            if(i > 69 && i < 80) {
                row8.getChildren().add(sqr[i]);
            }
            if(i > 79 && i < 90) {
                row9.getChildren().add(sqr[i]);
            }
            if(i > 89 && i < 100) {
                row10.getChildren().add(sqr[i]);
            }
        }
        layout.getChildren().addAll(row1, row2, row3, row4, row5, row6, row7, row8, row9, row10);
        return layout;
    }

    public static int[] tetrisShapes(Button[] sqr){
        int x = 5;
        double shape = Math.random()*0.2;
        int intShape = (int) shape;
        int[] shapes = {};
        if(intShape == 1) {
            shapes = new int[]{x, x - 1, x - 2, x - 12};
        }
        return shapes;
    }

    /*public static Button[] colorShape(int[] shapes, Button[] sqr){
        if(shapes.length == 4) {
            sqr[shapes[0]].setStyle("-fx-color: red");
            sqr[shapes[1]].setStyle("-fx-color: red");
            sqr[shapes[2]].setStyle("-fx-color: red");
            sqr[shapes[3]].setStyle("-fx-color: red");
        }
        return sqr;
    }*/

    public static void display(Stage primaryStage){
        StackPane view = new StackPane();
        view.getChildren().add(layout());

        Scene scene = new Scene(view, 1000, 1000);
        primaryStage.setTitle("Tetris");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
