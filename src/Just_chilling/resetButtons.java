package Just_chilling;

import javafx.scene.control.Button;

public class resetButtons {
    public resetButtons(){}

    public static Button[] reset(Button[] funcsqr, char[] color, Boolean[] pressed){
        for(int i = 0; i < funcsqr.length; i++){
            pressed[i] = false;
            color[i] = ' ';
            funcsqr[i].setStyle("-fx-base: white");
        }

        return funcsqr;
    }
}
