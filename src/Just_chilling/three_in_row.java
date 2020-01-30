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
        Button sqr9 = new Button();
        Button sqr8 = new Button();



        Button[] squares = {sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9};
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
                            checkRow(funcsqr, color, finalCurrent);
                        }else if (turn[0] == 1 && pressed[finalCurrent] == false){
                            funcsqr[finalCurrent].setStyle("-fx-base: blue;");
                            turn[0] = 0;
                            pressed[finalCurrent] = true;
                            color[finalCurrent] = 'B';
                            checkRow(funcsqr, color, finalCurrent);
                        }
                    }
                });
            }

        return funcsqr;
    }

    public static Button[] checkRow(Button[] funcsqr, char[] color, int finalCurrent){
        if(color[0] == 'R'){
            if(color[1] == 'R' && color[2] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }else if(color[4] == 'R' && color[8] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }else if(color[3] == 'R' && color[6] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }
        }else if(color[1] == 'R'){
            if(color[4] == 'R' && color[7] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }
        }else if(color[2] == 'R'){
            if(color[5] == 'R' && color[8] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }
        }else if(color[3] == 'R'){
            if(color[4] == 'R' && color[5] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }
        }else if(color[6] == 'R'){
            if(color[4] == 'R' && color[2] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }else if(color[7] == 'R' && color[8] == 'R'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: red;");
                }
            }
        }
        if(color[0] == 'B'){
            if(color[1] == 'B' && color[2] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }else if(color[4] == 'B' && color[8] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }else if(color[3] == 'B' && color[6] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }
        }else if(color[1] == 'B'){
            if(color[4] == 'B' && color[7] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }
        }else if(color[2] == 'B'){
            if(color[5] == 'B' && color[8] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }
        }else if(color[3] == 'B'){
            if(color[4] == 'B' && color[5] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }
        }else if(color[6] == 'B'){
            if(color[4] == 'B' && color[2] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
            }else if(color[7] == 'B' && color[8] == 'B'){
                for(int i = 0; i < funcsqr.length; i++){
                    funcsqr[i].setStyle("-fx-base: blue;");
                }
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

        Scene scene = new Scene(view,300, 300);
        primaryStage.setTitle("3 in row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static VBox layout(){
        Button[] squares = sqrFunction();

        for(int i = 0; i < squares.length; i++){
            squares[i].setMinWidth(100.0f);
            squares[i].setMinHeight(100.0f);
        }

        HBox row1 = new HBox();
        row1.getChildren().addAll(squares[0], squares[1], squares[2]);

        HBox row2 = new HBox();
        row2.getChildren().addAll(squares[3], squares[4], squares[5]);

        HBox row3 = new HBox();
        row3.getChildren().addAll(squares[6], squares[7], squares[8]);

        VBox layout = new VBox();
        layout.getChildren().addAll(row1,row2,row3);

        return layout;
    }
}
