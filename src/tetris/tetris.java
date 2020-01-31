package tetris;

import java.awt.*;
import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class tetris {
    public static void main(String[] args) {
        createSqr();
    }

    public static Rectangle[] createSqr(){
        Rectangle[] sqr = {};
        for(int i = 0; i < 100; i++){
            sqr[i] = new Rectangle();
        }
        return sqr;
    }

    public static VBox layout(Rectangle[] sqr){

        HBox row1 = new HBox();
        row1.getChildren().addAll();

        VBox layout = new VBox();

        return layout;
    }

}
