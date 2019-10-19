package V40;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;

import java.lang.reflect.Array;

//gör så när man klickar på exempel + så loppar den igenom så de inte blir ++ i rutan
public class ovning_lektion extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{

        layout(primaryStage);
    }
    public static void layout(Stage primaryStage) throws Exception{
        Button btn0 = new Button();
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        Button btn7 = new Button();
        Button btn8 = new Button();
        Button btn9 = new Button();
        Button btnPlus = new Button();
        Button btnMinus = new Button();
        Button btnDiv = new Button();
        Button btnTimes = new Button();
        Button btnMod = new Button();
        Button btnClear = new Button();
        Button btnEq = new Button();

        int distans = 0;
        String number = "";

        Button[] buttonsNumber = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnTimes, btnDiv, btnEq, btnClear, btnMod};

        for(int i = 0; i <= buttonsNumber.length - 1; i++){
            number = String.valueOf(i);
            buttonsNumber[i].setMinWidth(50.0f);
            buttonsNumber[i].setMinHeight(50.0f);
            buttonsNumber[i].setText(number);
            buttonsNumber[i].setTranslateX(distans);
            distans += 60;
        }

        Group numbers = new Group(btn0);
        numbers.getChildren().addAll(btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9);

        Scene scene = new Scene(numbers, 600, 600);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
