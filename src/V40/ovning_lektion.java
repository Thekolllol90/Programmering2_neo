package V40;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import java.awt.*;


public class ovning_lektion extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        TextField input = new TextField();
        TextField output = new TextField();
        
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
        Button btnMulti = new Button();
        Button btnDiv = new Button();
        Button btnKom = new Button();

        Rectangle rec = new Rectangle();

        rec.setHeight(600.0f);
        rec.setWidth(600.0f);
        rec.setFill(Color.BLACK);

        Group test = new Group(rec);
        Scene scene = new Scene(test, 600, 600);
        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
