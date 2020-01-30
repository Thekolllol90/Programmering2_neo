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



        Button[] squares = {sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9};
        return squares;
    }

    public static Button[] sqrFunction(){
        Button[] funcsqr = squares();
        final int[] turn = {0};
        int current = 0;
            for(int i = 0; i < funcsqr.length; i++){
                current = i;
                int finalCurrent = current;
                funcsqr[i].setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        if(turn[0] == 0){
                            funcsqr[finalCurrent].setStyle("-fx-base: red;");
                            turn[0] = 1;
                        }else if (turn[0] == 1){
                            funcsqr[finalCurrent].setStyle("-fx-base: blue;");
                            turn[0] = 0;
                        }
                    }
                });
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
        row1.getChildren().addAll(squares[3], squares[4], squares[5]);

        HBox row3 = new HBox();
        row1.getChildren().addAll(squares[6], squares[7], squares[8]);

        VBox layout = new VBox(row1, row2, row3);
        layout.getChildren().addAll();

        return layout;
    }
}
