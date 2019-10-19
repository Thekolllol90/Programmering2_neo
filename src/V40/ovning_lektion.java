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

        btn0.setMinWidth(50.0f);
        btn0.setMinHeight(50.0f);
        btn0.setText("0");

        btn1.setMinWidth(50.0f);
        btn1.setMinHeight(50.0f);
        btn1.setText("1");

        btn2.setMinWidth(50.0f);
        btn2.setMinHeight(50.0f);
        btn2.setText("2");

        btn3.setMinWidth(50.0f);
        btn3.setMinHeight(50.0f);
        btn3.setText("3");

        btn4.setMinWidth(50.0f);
        btn4.setMinHeight(50.0f);
        btn4.setText("4");

        btn5.setMinWidth(50.0f);
        btn5.setMinHeight(50.0f);
        btn5.setText("5");

        btn6.setMinWidth(50.0f);
        btn6.setMinHeight(50.0f);
        btn6.setText("6");

        btn7.setMinWidth(50.0f);
        btn7.setMinHeight(50.0f);
        btn7.setText("7");

        btn8.setMinWidth(50.0f);
        btn8.setMinHeight(50.0f);
        btn8.setText("8");

        btn9.setMinWidth(50.0f);
        btn9.setMinHeight(50.0f);
        btn9.setText("9");

        btnPlus.setMinWidth(50.0f);
        btnPlus.setMinHeight(50.0f);
        btnPlus.setText("+");

        btnMinus.setMinWidth(50.0f);
        btnMinus.setMinHeight(50.0f);
        btnMinus.setText("-");

        btnTimes.setMinWidth(50.0f);
        btnTimes.setMinHeight(50.0f);
        btnTimes.setText("*");

        btnDiv.setMinWidth(50.0f);
        btnDiv.setMinHeight(50.0f);
        btnDiv.setText("/");

        btnEq.setMinWidth(50.0f);
        btnEq.setMinHeight(50.0f);
        btnEq.setText("=");

        btnClear.setMinWidth(50.0f);
        btnClear.setMinHeight(50.0f);
        btnClear.setText("C");

        btnMod.setMinWidth(50.0f);
        btnMod.setMinHeight(50.0f);
        btnMod.setText("%");



        Group forNow = new Group(btn0);

        Scene scene = new Scene(forNow, 600, 600);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
