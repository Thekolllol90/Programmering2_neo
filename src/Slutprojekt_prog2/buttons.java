package Slutprojekt_prog2;

import javafx.scene.control.Button;

public class buttons {
    public buttons(){}

    public static Button[] CreateButtons(){
        Button[] buttons = {null, null, null, null, null, null, null, null, null};
        for(int i = 0; i < 9; i++){
            buttons[i] = new Button();
        }

        return buttons;
    }
}
