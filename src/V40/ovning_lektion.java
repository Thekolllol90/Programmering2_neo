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
public class ovning_lektion extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        layout(primaryStage);
    }
    public static Button[] buttons(){ //en method som skapra alla knappar och lägger dom i en lista som den returnar
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
    public static void layout(Stage primaryStage) throws Exception{ // en method som ger alla knappar sina tecken storlek och vad som händer när man klickar på en knapp
        Button[] buttonsNumber = buttons(); // hämtar en lista med alla knappar

        int calcValue = 0; //håller koll på vilken knapp man är på

        ArrayList<Character> internalText = new ArrayList<Character>(); // en lista som håller alla number och operatorer man klickar på
        char[] number = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '=', 'C', '%', '<', '.', 'r'}; // en lista som ska ge knapparna sina tecken

        for(int i = 0; i < buttonsNumber.length; i++){ // en loop som ger alla knappar en storlek och ger dom sitt tecken
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
        eight.getChildren().addAll(buttonsNumber[19]); // skapar columner med knappar

        VBox vBox = new VBox(one);
        vBox.getChildren().addAll(two, four, five, six, seven, eight); // tar alla rader och lägger dom i rader

        for(int i = 0; i < buttonsNumber.length; i++){ // en loop som säger åt knapparna vad dom ska göra när man klickar på dom
            int finalCalcValue = calcValue;
            buttonsNumber[i].setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    char c =  number[finalCalcValue]; // håller koll på numret på knappen
                    calc calc = new calc();
                    check check = new check();
                    press press = new press();
                    string string = new string();
                    display display = new display();

                    if(c == '=') { // om knappen man klickar på är "=" så gör den om arrayn och skickar den till methoden som räknar ut och sedan målar den
                        String calculation = string.arrayListToString(internalText);
                        double result = calc.calculate(calculation);
                        calcOut(result, internalText);
                        display.paint(primaryStage, vBox, internalText);
                    } else if(c == 'C'){ // kallar på en method som rennsar arrayn och målar
                        press.pressC(internalText);
                        display.paint(primaryStage, vBox, internalText);
                    } else if(c == '<'){ // kallar på en method som tar bort de sista i arrayn och målar
                        press.pressBack(internalText);
                        display.paint(primaryStage, vBox, internalText);
                    } else { // lägger till tecknet på knappan man klickar på i arrayn och målar
                        internalText.add(c);
                        check.checkLast(internalText);
                        check.checkFirst(internalText);
                        display.paint(primaryStage, vBox, internalText);
                    }
                }
            });
            calcValue++;
        }
        display.paint(primaryStage, vBox, internalText); // kallar på methoden som målar så att man får upp ett fönster
    }
    public static void calcOut(double result, ArrayList<Character> internalText){ // gör om resultatet från uträkningen till en array
        ArrayList<Character> list = internalText;
        list.clear();

        double x = result;
        String toArray = "";
        toArray = String.valueOf(x); // gör double till string

        for(int i = 0; i < toArray.length(); i++){ // gör string till array
            list.add(toArray.charAt(i));
        }
    }
}
