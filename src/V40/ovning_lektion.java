package V40;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;

// 4  +  2 * 2
// blev upptagen med att de va lov så glömde uppgiften och hade inte tid att fixa så man kunde använda decimal tal

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
        Button btnCom = new Button();
        Button btnRot = new Button();

        Button[] buttonsNumber = {btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus, btnTimes, btnDiv, btnEq, btnClear, btnMod, btnDel, btnCom, btnRot};

        return buttonsNumber;
    }

    public static void layout(Stage primaryStage) throws Exception{
        Button[] buttonsNumber = buttons();

        int calcValue = 0;

        ArrayList<Character> internalText = new ArrayList<Character>();
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '=', 'C', '%', '<', '.', 'r'};

        for(int i = 0; i < buttonsNumber.length; i++){
            buttonsNumber[i].setMinWidth(50.0f);
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

        for(int i = 0; i < buttonsNumber.length; i++){
            int finalCalcValue = calcValue;
            buttonsNumber[i].setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    char c =  number[finalCalcValue];
                    calc calc = new calc();

                    if(c == '=') {
                        String calculation = arrayListToString(internalText);
                        double result = calc.calculate(calculation);
                        calcOut(result, internalText);
                        paint(primaryStage, vBox, internalText);
                    } else if(c == 'C'){
                        pressC(internalText);
                        paint(primaryStage, vBox, internalText);
                    } else if(c == '<'){
                        pressBack(internalText);
                        paint(primaryStage, vBox, internalText);
                    } else {
                        internalText.add(c);
                        checkLast(internalText);
                        checkFirst(internalText);
                        paint(primaryStage, vBox, internalText);
                    }
                }
            });
            calcValue++;
        }

        paint(primaryStage, vBox, internalText);
    }

    public static void paint(Stage primaryStage, VBox vBox, ArrayList<Character> internalText) {
        String calcText = "";
        calcText = arrayListToString(internalText);

        TextField calc = new TextField();
        calc.setDisable(true);
        calc.setText(calcText);

        BorderPane display = new BorderPane();
        display.setTop(calc);
        display.setCenter(vBox);

        Scene scene = new Scene(display, 300, 400);
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

    public static boolean lastIsOperator(char c) {
        switch (c){
            case '+':
            case '-':
            case '*':
            case '%':
            case '/':
            case 'r':
                return true;
            default:
                return false;
        }
    }
    public static boolean firstIsOperator(char c) {
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
            if(lastIsOperator(first) && lastIsOperator(last)) {
                list.remove(list.size() - 1);
            }
        }
        return list;
    }
    public static ArrayList<Character> checkFirst(ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        if(list.size() == 1){
            char first = list.get(list.size() - 1);
            if(firstIsOperator(first)){
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

    public static void calcOut(double result, ArrayList<Character> internalText){
        ArrayList<Character> list = internalText;
        list.clear();

        double x = result;
        String toArray = "";
        toArray = String.valueOf(x);

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
