package V40;

import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class display {
    public display(){}
    public static void paint(Stage primaryStage, VBox vBox, ArrayList<Character> internalText) { // methoden som alltid målar
        String calcText = "";
        calcText = string.arrayListToString(internalText); // gör om arrayn till en string

        TextField calc = new TextField();
        calc.setDisable(true); // gör så att man inte kan skriva in något utan att klicka på knapparna
        calc.setText(calcText); // gör så att texten i textfeltet är samma som calcText

        BorderPane display = new BorderPane();
        display.setTop(calc);
        display.setCenter(vBox);

        Scene scene = new Scene(display, 300, 400);
        primaryStage.setTitle("Calc");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
