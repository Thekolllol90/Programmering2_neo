package Slutprojekt_prog2;

import Just_chilling.buttonLayout;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class controller {
    public controller(){}

    public static void display(Stage primaryStage){
        buttons buttons = new buttons();
        buttons.CreateButtons();
        StackPane view = new StackPane();

        Scene scene = new Scene(view,300, 350);
        primaryStage.setTitle("Three in a row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void select_color(){

    }
}
