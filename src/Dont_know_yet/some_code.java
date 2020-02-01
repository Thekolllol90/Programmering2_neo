package Dont_know_yet;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class some_code extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

    }

    public static Rectangle[] createSqr(){
        Rectangle[] sqr = new Rectangle[]{};

        for(int i = 0; i < 400; i++){
            sqr[i] = new Rectangle();
        }

        return sqr;
    }

    public static VBox layout(){
        Rectangle[] sqr = createSqr();
        HBox[] rows = new HBox[]{};

        for(int i = 0; i < sqr.length; i++){
            sqr[i].setSize(10,10);
        }

        VBox layout = new VBox();
        layout.getChildren().addAll();

        return layout;
    }

}
