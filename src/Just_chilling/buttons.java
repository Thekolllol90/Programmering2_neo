package Just_chilling;

import javafx.scene.control.Button;

public class buttons {
    public buttons(){}

    public static Button[] createButtons(){
        Button sqr1 = new Button();
        Button sqr2 = new Button();
        Button sqr3 = new Button();
        Button sqr4 = new Button();
        Button sqr5 = new Button();
        Button sqr6 = new Button();
        Button sqr7 = new Button();
        Button sqr8 = new Button();
        Button sqr9 = new Button();
        Button reset = new Button();

        Button[] squares = {sqr1, sqr2, sqr3, sqr4, sqr5, sqr6, sqr7, sqr8, sqr9, reset};
        return squares;
    }

    public static Button[] buttonFunction(){
        Button[] funcsqr = createButtons();
        Boolean[] pressed = {false, false, false, false, false, false, false, false, false, false};
        char[] color = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '};
        final int[] turn = {0};

        check check = new check();
        resetButtons resetButtons = new resetButtons();

        int current = 0;
        for(int i = 0; i < funcsqr.length; i++){
            current = i;
            int finalCurrent = current;
            funcsqr[i].setOnAction(event -> {
                if(turn[0] == 0 && pressed[finalCurrent] == false){
                    funcsqr[finalCurrent].setStyle("-fx-base: red;");
                    turn[0] = 1;
                    pressed[finalCurrent] = true;
                    color[finalCurrent] = 'R';
                    check.row(funcsqr, color);
                    check.full(funcsqr, color, pressed);
                }else if(turn[0] == 1 && pressed[finalCurrent] == false){
                    funcsqr[finalCurrent].setStyle("-fx-base: blue;");
                    turn[0] = 0;
                    pressed[finalCurrent] = true;
                    color[finalCurrent] = 'B';
                    check.row(funcsqr, color);
                    check.full(funcsqr, color, pressed);
                }
                if(finalCurrent == 9){
                    resetButtons.reset(funcsqr, color, pressed);
                }
            });
        }

        return funcsqr;
    }
}
