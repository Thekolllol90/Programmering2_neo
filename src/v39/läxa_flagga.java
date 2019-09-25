package v39;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.awt.*;

public class läxa_flagga extends Application {
    public static void main(String[] args) { launch(args);}

    public void start(Stage primaryStage) throws Exception{
        String name = "";

        Rectangle squ = new Rectangle();
        Rectangle rec = new Rectangle();
        Rectangle back = new Rectangle();

        StackPane swe = new Group(back);
        swe.getChildren(rec);
        swe.getChildren(squ);

        Scene scene = new Scene(swe, 600, 300);
        primaryStage.setTitle(name);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_1(){

    }
}
