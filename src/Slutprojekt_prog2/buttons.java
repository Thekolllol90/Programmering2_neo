package Slutprojekt_prog2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class buttons {
    public buttons(){}

    public static Button[] CreateButtons(){
        Button[] buttons = {null, null, null, null, null, null, null, null, null};
        for(int i = 0; i < 9; i++){
            buttons[i] = new Button();
        }

        return buttons;
    }

    public static Button[] ButtonFunction(Button[] buttons){
        requests requests = new requests();
        int current;
        final Boolean[] playerTurn = {true};
        Color[] color = requests.GameColors();
        for(int i = 0; i < buttons.length; i++){
            current = i;

            int finalCurrent = current;
            buttons[i].setOnAction(event -> {
                Color currentColor = (Color)buttons[finalCurrent].getBackground().getFills().get(0).getFill();

                if(currentColor != color[0] || currentColor != color[1]){
                    if(playerTurn[0] == true){
                        buttons[finalCurrent].setBackground(new Background(new BackgroundFill(color[0], CornerRadii.EMPTY, Insets.EMPTY)));
                        playerTurn[0] = false;
                    } else{
                        buttons[finalCurrent].setBackground(new Background(new BackgroundFill(color[1], CornerRadii.EMPTY, Insets.EMPTY)));
                        playerTurn[0] = true;
                    }
                }
            });
        }


        return buttons;
    }
}
