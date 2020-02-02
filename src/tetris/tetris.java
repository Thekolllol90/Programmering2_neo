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
    public void start(Stage primaryStage){
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
                display(primaryStage);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    public static Button[] createSqr(){
        Button[] sqr = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        Boolean[] color = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};
        for(int i = 0; i < 100; i++){
            sqr[i] = new Button();
            color[i] = false;
        }
        return sqr;
    }

    public static VBox layout(){
        Button[] sqr = moveDown();
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

    public static int[] generateShape(){
        int intShape = (int) ((Math.random()*5)+1);
        int y = 0;
        if(intShape == 1 || intShape == 2){
            y = 7;
        }else if(intShape == 3 || intShape == 5){
            y = 8;
        }else if(intShape == 4){
            y = 9;
        }else if(intShape == 6){
            y = 6;
        }

        int x = (int) (Math.random()*y);
        int[] shapes = {};

        if(intShape == 1) {
            shapes = new int[]{x, x + 1, x + 2, x + 12};
        }else if(intShape == 2){
            shapes = new int[]{x, x + 1, x + 2, x + 11};
        }else if(intShape == 3){
            shapes = new int[]{x, x + 1, x + 11};
        }else if(intShape == 4){
            shapes = new int[]{x, x + 10, x + 20, x + 30};
        }else if(intShape == 5){
            shapes = new int[]{x, x + 1, x + 10, x + 11};
        }else if(intShape == 6){
            shapes = new int[]{x, x + 1, x + 11, x + 12};
        }
        return shapes;
    }

    public static Button[] moveDown(){
        //create variable isMoving if true don't generate new shape
        //use boolean[] color
        //use int rowRemoved
        int[] shape = {};
        int spaceDown = 0;
        Button[] sqr = createSqr();
        Boolean generate = true;
        Boolean moveRight = false;
        Boolean moveLeft = false;
        int rows = 0;
        int down = 10;
        int left = -1;
        int right = 1;
        int rowRemoved = 10 * rows;

        if(generate == true) {
            shape = generateShape();
            generate = false;
            for(int i = 0; i < shape.length; i++){
                sqr[shape[i]].setStyle("-fx-base: red;");
            }
        }else if(generate == false){
            if(moveRight == true){
                spaceDown += (down + right);
            }else if(moveLeft == true){
                spaceDown += (down + left);
            }else {
                spaceDown += down;
            }
            for(int i = 0; i < shape.length; i++){
                sqr[shape[i]].setStyle("-fx-base: white");
                sqr[shape[i] + spaceDown].setStyle("-fx-base: red");
            }
        }

        return sqr;
    }

    public static void display(Stage primaryStage){

        StackPane view = new StackPane();
        view.getChildren().add(layout());


        Scene scene = new Scene(view, 1000, 1100);
        primaryStage.setTitle("Tetris");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
