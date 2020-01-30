package Just_chilling;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class three_in_row extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        playGame(primaryStage);
    }

    public static Button[] squares(){
        Button sqr1 = new Button();
        Button sqr2 = new Button();
        Button sqr3 = new Button();
        Button sqr4 = new Button();
        Button sqr5 = new Button();
        Button sqr6 = new Button();
        Button sqr7 = new Button();
        Button sqr8 = new Button();
        Button sqr9 = new Button();
        Button reset = new Button();



        Button[] squares = {sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9, reset};
        return squares;
    }

    public static Button[] sqrFunction(){
        Button[] funcsqr = squares();
        Boolean[] pressed = {false, false, false, false, false, false, false, false, false};
        char[] color = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        final int[] turn = {0};

        int current = 0;
            for(int i = 0; i < funcsqr.length; i++){
                current = i;
                int finalCurrent = current;
                funcsqr[i].setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(turn[0] == 0 && pressed[finalCurrent] == false){
                            funcsqr[finalCurrent].setStyle("-fx-base: red;");
                            turn[0] = 1;
                            pressed[finalCurrent] = true;
                            color[finalCurrent] = 'R';
                            checkRow(funcsqr, color);
                            checkFull(funcsqr, color, pressed);
                        }else if(turn[0] == 1 && pressed[finalCurrent] == false){
                            funcsqr[finalCurrent].setStyle("-fx-base: blue;");
                            turn[0] = 0;
                            pressed[finalCurrent] = true;
                            color[finalCurrent] = 'B';
                            checkRow(funcsqr, color);
                            checkFull(funcsqr, color, pressed);
                        }
                        if(finalCurrent == 9){
                            reset(funcsqr, color, pressed);
                        }
                    }
                });
            }

        return funcsqr;
    }

    public static Button[] reset(Button[] funcsqr, char[] color, Boolean[] pressed){
        for(int i = 0; i < funcsqr.length; i++){
            pressed[i] = false;
            color[i] = ' ';
            funcsqr[i].setStyle("-fx-base: white");
        }

        return funcsqr;
    }

    public static Button[] checkFull(Button[] funcsqr, char[] color, Boolean[] pressed){
        int check = 0;
        for(int i = 0; i < color.length; i++){
            if(color[i] == ' '){
                check++;
            }
        }
        if(check == 0){
            reset(funcsqr, color, pressed);
        }


        return funcsqr;
    }

    public static Button[] colorAllRed(Button[] funcsqr){
        for(int i = 0; i < funcsqr.length; i++){
            funcsqr[i].setStyle("-fx-base: red;");
        }
        return funcsqr;
    }

    public static Button[] colorAllBlue(Button[] funcsqr){
        for(int i = 0; i < funcsqr.length; i++){
            funcsqr[i].setStyle("-fx-base: blue;");
        }
        return funcsqr;
    }

    public static Button[] checkRow(Button[] funcsqr, char[] color){
        if(color[0] == 'R'){
            if(color[1] == 'R' && color[2] == 'R'){
                colorAllRed(funcsqr);
            }else if(color[4] == 'R' && color[8] == 'R'){
                colorAllRed(funcsqr);
            }else if(color[3] == 'R' && color[6] == 'R'){
                colorAllRed(funcsqr);
            }
        }else if(color[1] == 'R'){
            if(color[4] == 'R' && color[7] == 'R'){
                colorAllRed(funcsqr);
            }
        }else if(color[2] == 'R'){
            if(color[5] == 'R' && color[8] == 'R'){
                colorAllRed(funcsqr);
            }
        }else if(color[3] == 'R'){
            if(color[4] == 'R' && color[5] == 'R'){
                colorAllRed(funcsqr);
            }
        }else if(color[6] == 'R'){
            if(color[4] == 'R' && color[2] == 'R'){
                colorAllRed(funcsqr);
            }else if(color[7] == 'R' && color[8] == 'R'){
                colorAllRed(funcsqr);
            }
        }
        if(color[0] == 'B'){
            if(color[1] == 'B' && color[2] == 'B'){
                colorAllBlue(funcsqr);
            }else if(color[4] == 'B' && color[8] == 'B'){
                colorAllBlue(funcsqr);
            }else if(color[3] == 'B' && color[6] == 'B'){
                colorAllBlue(funcsqr);
            }
        }else if(color[1] == 'B'){
            if(color[4] == 'B' && color[7] == 'B'){
                colorAllBlue(funcsqr);
            }
        }else if(color[2] == 'B'){
            if(color[5] == 'B' && color[8] == 'B'){
                colorAllBlue(funcsqr);
            }
        }else if(color[3] == 'B'){
            if(color[4] == 'B' && color[5] == 'B'){
                colorAllBlue(funcsqr);
            }
        }else if(color[6] == 'B'){
            if(color[4] == 'B' && color[2] == 'B'){
                colorAllBlue(funcsqr);
            }else if(color[7] == 'B' && color[8] == 'B'){
                colorAllBlue(funcsqr);
            }
        }

        return funcsqr;
    }

    public static void playGame(Stage primaryStage){

        display(primaryStage);
    }

    public static void display(Stage primaryStage){
        StackPane view = new StackPane();
        view.getChildren().add(layout());

        Scene scene = new Scene(view,300, 350);
        primaryStage.setTitle("3 in row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static VBox layout(){
        Button[] squares = sqrFunction();

        for(int i = 0; i < squares.length; i++){
            squares[i].setMinWidth(100.0f);
            squares[i].setMinHeight(100.0f);
            if(i == 9){
                squares[i].setMaxWidth(300.0f);
                squares[i].setMinHeight(50.0f);
                squares[i].setText("Reset");
            }
        }

        HBox row1 = new HBox();
        row1.getChildren().addAll(squares[0], squares[1], squares[2]);

        HBox row2 = new HBox();
        row2.getChildren().addAll(squares[3], squares[4], squares[5]);

        HBox row3 = new HBox();
        row3.getChildren().addAll(squares[6], squares[7], squares[8]);

        VBox layout = new VBox();
        layout.getChildren().addAll(squares[9],row1,row2,row3);

        return layout;
    }
}
