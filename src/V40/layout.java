package V40;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class layout {
    public layout(){}

    public static Button[] buttons(){
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
        Button btnDel = new Button();
        Button btnCom = new Button();
        Button btnRot = new Button();

        Button[] buttonsNumber = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnTimes, btnDiv, btnEq, btnClear, btnMod, btnDel, btnCom, btnRot};

        return buttonsNumber;
    }
    public static VBox layout(Stage primaryStage) throws Exception {
        Button[] buttonsNumber = buttons();

        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '=', 'C', '%', '<', '.', 'r'};

        for (int i = 0; i < buttonsNumber.length; i++) {
            buttonsNumber[i].setMinWidth(100.0f);
            buttonsNumber[i].setMinHeight(50.0f);
            buttonsNumber[i].setText(String.valueOf(number[i]));
        }

        HBox one = new HBox(buttonsNumber[1]);
        one.getChildren().addAll(buttonsNumber[2], buttonsNumber[3]);

        HBox two = new HBox(buttonsNumber[4]);
        two.getChildren().addAll(buttonsNumber[5], buttonsNumber[6]);

        HBox four = new HBox(buttonsNumber[7]);
        four.getChildren().addAll(buttonsNumber[8], buttonsNumber[9]);

        HBox five = new HBox(buttonsNumber[10]);
        five.getChildren().addAll(buttonsNumber[0], buttonsNumber[11]);

        HBox six = new HBox(buttonsNumber[12]);
        six.getChildren().addAll(buttonsNumber[13], buttonsNumber[14]);

        HBox seven = new HBox(buttonsNumber[15]);
        seven.getChildren().addAll(buttonsNumber[16], buttonsNumber[17]);

        HBox eight = new HBox(buttonsNumber[18]);
        eight.getChildren().addAll(buttonsNumber[19]);

        VBox vBox = new VBox(one);
        vBox.getChildren().addAll(two, four, five, six, seven, eight);

        return vBox;
    }
}

