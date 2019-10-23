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

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

// 4  +  2 * 2

//gör så när man klickar på exempel + så loppar den igenom så de inte blir ++ i rutan
public class ovning_lektion extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        layout(primaryStage);
    }

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

        Button[] buttonsNumber = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnTimes, btnDiv, btnEq, btnClear, btnMod, btnDel};

        return buttonsNumber;
    }

    public static void layout(Stage primaryStage) throws Exception{
        Button[] buttonsNumber = buttons();

        int distans = 10;
        int calcValue = 0;

        ArrayList<Character> internalText = new ArrayList<Character>();
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '=', 'C', '%', '<'};

        for(int i = 0; i < buttonsNumber.length; i++){
            buttonsNumber[i].setMinWidth(50.0f);
            buttonsNumber[i].setMinHeight(50.0f);
            buttonsNumber[i].setText(String.valueOf(number[i]));
            buttonsNumber[i].setTranslateX(distans);
            distans += 60;
        }

        Group numbers = new Group(buttonsNumber[0]);
        numbers.getChildren().addAll(buttonsNumber[1], buttonsNumber[2], buttonsNumber[3], buttonsNumber[4], buttonsNumber[5], buttonsNumber[6], buttonsNumber[7], buttonsNumber[8], buttonsNumber[9]);

        Group ops = new Group(buttonsNumber[10]);
        ops.getChildren().addAll(buttonsNumber[11], buttonsNumber[12], buttonsNumber[13], buttonsNumber[16], buttonsNumber[15], buttonsNumber[14], buttonsNumber[17]);

        for(int i = 0; i < buttonsNumber.length; i++){
            int finalCalcValue = calcValue;
            buttonsNumber[i].setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    char c =  number[finalCalcValue];

                    if(c == '=') {
                        String calculation = arrayListToString(internalText);
                        int result = calc(calculation);
                        calcOut(result, internalText);
                        paint(buttonsNumber, primaryStage, numbers, ops, internalText);
                    } else if(c == 'C'){
                        pressC(internalText);
                        paint(buttonsNumber, primaryStage, numbers, ops, internalText);
                    } else if(c == '<'){
                        pressBack(internalText);
                        paint(buttonsNumber, primaryStage, numbers, ops, internalText);
                    } else {
                        internalText.add(c);
                        checkLast(internalText);
                        paint(buttonsNumber, primaryStage, numbers, ops, internalText);
                    }
                }
            });
            calcValue++;
        }

        BorderPane display = new BorderPane();
        display.setCenter(numbers);
        display.setBottom(ops);

        Scene scene = new Scene(display, 610, 300);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void paint(Button[] buttonsNumber, Stage primaryStage, Group numbers, Group ops, ArrayList<Character> internalText) {
        TextField calc = new TextField();
        calc.setDisable(true);

        String calcText = "";

        calcText = arrayListToString(internalText);

        calc.setText(calcText);

        BorderPane display = new BorderPane();
        display.setTop(calc);
        display.setCenter(numbers);
        display.setBottom(ops);

        Scene scene = new Scene(display, 610, 300);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static String arrayListToString(ArrayList<Character> internalText){
        String res = "";
        for(int i = 0; i < internalText.size(); i++){
            res = res + internalText.get(i);
        }
        return res;
    }

    public static int[] getInt(String text, int start) {
        int current = start;
        while(current < text.length() && Character.isWhitespace(text.charAt(current))) {
            current++;
        }

        //  123
        start = current;

        while(current < text.length() && Character.isDigit(text.charAt(current))) {
            current++;
        }

        int value = Integer.parseInt(text.substring(start, current));

        return new int[] { value, current };
    }

    public static int calc(String text) {
        // 123+ 2
        int current = 0;
        int result = 0;

        while(current < text.length()) {
            while(current < text.length() && Character.isWhitespace(text.charAt(current))) {
                current++;
            }

            if(Character.isDigit(text.charAt(current))) {
                int[] values = getInt(text, current);
                result = values[0];
                current = values[1];
            } else {
                switch(text.charAt(current)) {
                    case '+': {
                        current++;
                        int[] values = getInt(text, current);
                        int right = values[0];
                        current = values[1];

                        result += right;
                    } break;

                    case '*': {
                        current++;
                        int[] values = getInt(text, current);
                        int right = values[0];
                        current = values[1];

                        result *= right;
                    } break;

                    case '-': {
                        current++;
                        int[] values = getInt(text, current);
                        int right = values[0];
                        current = values[1];

                        result -= right;
                    } break;

                    case '/': {
                        current++;
                        int[] values = getInt(text, current);
                        int right = values[0];
                        current = values[1];

                        result /= right;
                    } break;

                    case '%': {
                        current++;
                        int[] values = getInt(text, current);
                        int right = values[0];
                        current = values[1];

                        result %= right;
                    } break;
                }
            }
        }

        return result;
    }

    public static boolean isOperator(char c) {
        switch (c){
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
                return true;
            default:
                return false;
        }
    }

    public static ArrayList<Character> checkLast(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        if(list.size() >= 2) {
            char first = list.get(list.size() - 1);
            char last = list.get(list.size() - 2);
            if(isOperator(first) && isOperator(last)) {
                list.remove(list.size() - 1);
            }
        }
        return list;
    }

    public static ArrayList<Character> pressC(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.clear();
        return list;
    }

    public static void calcOut(int result, ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.clear();

        int x = result;
        String toArray = "";
        toArray = Integer.toString(x);

        for(int i = 0; i < toArray.length(); i++){
            list.add(toArray.charAt(i));
        }
    }

    public static ArrayList<Character> pressBack(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.remove(list.size() - 1);
        return list;
    }
}
