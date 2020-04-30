package Slutprojekt_prog2;

import javafx.scene.control.Button;
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
        int current;
        final Boolean[] playerTurn = {true};
        Paint color1 = null;
        Paint color2 = null;
        for(int i = 0; i < buttons.length; i++){
            current = i;

            int finalCurrent = current;
            buttons[i].setOnAction(event -> {
                Paint currentColor = buttons[finalCurrent].getBackground().getFills().get(0).getFill();

                if(currentColor != color1 || currentColor != color2){
                    if(playerTurn[0] == true){
                        buttons[finalCurrent].setStyle("-fx-base: red;");
                        playerTurn[0] = false;
                    } else{
                        buttons[finalCurrent].setStyle("-fx-base: blue;");
                        playerTurn[0] = true;
                    }
                }
            });
        }


        return buttons;
    }
}
