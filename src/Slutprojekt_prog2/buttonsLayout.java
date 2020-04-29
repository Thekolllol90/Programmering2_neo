package Slutprojekt_prog2;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class buttonsLayout {
    public buttonsLayout(){}

    public static Button[] buttonStyle(Button[] buttons){
        for(int i = 0; i < buttons.length; i++){
            buttons[i].setMinWidth(100.0f);
            buttons[i].setMinHeight(100.0f);
        }


        return buttons;
    }

    public static VBox layout(Button[] buttons){
        HBox row1 = new HBox();
        row1.getChildren().addAll(buttons[0], buttons[1], buttons[2]);

        HBox row2 = new HBox();
        row1.getChildren().addAll(buttons[0], buttons[1], buttons[2]);

        HBox row3 = new HBox();
        row1.getChildren().addAll(buttons[0], buttons[1], buttons[2]);

        VBox layout = new VBox();
        layout.getChildren().addAll(row1, row2, row3);

        return layout;
    }
}
