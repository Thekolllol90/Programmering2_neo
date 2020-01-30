package Just_chilling;

import javafx.scene.control.Button;

public class fullColor {
    public  fullColor(){}

    public static Button[] red(Button[] funcsqr){
        for(int i = 0; i < funcsqr.length; i++){
            funcsqr[i].setStyle("-fx-base: red;");
        }
        return funcsqr;
    }

    public static Button[] blue(Button[] funcsqr){
        for(int i = 0; i < funcsqr.length; i++){
            funcsqr[i].setStyle("-fx-base: blue;");
        }
        return funcsqr;
    }
}
