package Slutprojekt_prog2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class controller {
    public controller(){}

    public static void display(Stage primaryStage){
        buttons buttons = new buttons();
        buttonsLayout buttonsLayout = new buttonsLayout();

        Button[] buttons1 = buttons.CreateButtons();
        buttons.ButtonFunction(buttons1);
        buttonsLayout.buttonStyle(buttons1);

        StackPane view = new StackPane();
        view.getChildren().add(buttonsLayout.layout(buttons1));

        Scene scene = new Scene(view,300, 300);
        primaryStage.setTitle("Three in a row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void select_color(){

    }
}
