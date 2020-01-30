package Just_chilling;

import javafx.scene.control.Button;

public class check {
    public check(){}

    public static Button[] full(Button[] funcsqr, char[] color, Boolean[] pressed){
        resetButtons resetButtons = new resetButtons();
        int check = 0;
        for(int i = 0; i < color.length; i++){
            if(color[i] == ' '){
                check++;
            }
        }
        if(check == 0){
            resetButtons.reset(funcsqr, color, pressed);
        }


        return funcsqr;
    }

    public static Button[] row(Button[] funcsqr, char[] color){
        fullColor fullColor = new fullColor();
        if(color[0] == 'R'){
            if(color[1] == 'R' && color[2] == 'R'){
                fullColor.red(funcsqr);
            }
            if(color[4] == 'R' && color[8] == 'R'){
                fullColor.red(funcsqr);
            }
            if(color[3] == 'R' && color[6] == 'R'){
                fullColor.red(funcsqr);
            }
        }
        if(color[1] == 'R'){
            if(color[4] == 'R' && color[7] == 'R'){
                fullColor.red(funcsqr);
            }
        }
        if(color[2] == 'R'){
            if(color[5] == 'R' && color[8] == 'R'){
                fullColor.red(funcsqr);
            }
            if(color[4] == 'R' && color[6] == 'R'){
                fullColor.red(funcsqr);
            }
        }
        if(color[3] == 'R'){
            if(color[4] == 'R' && color[5] == 'R'){
                fullColor.red(funcsqr);
            }
        }
        if(color[6] == 'R'){
            if(color[7] == 'R' && color[8] == 'R'){
                fullColor.red(funcsqr);
            }
        }
        if(color[0] == 'B'){
            if(color[1] == 'B' && color[2] == 'B'){
                fullColor.blue(funcsqr);
            }
            if(color[4] == 'B' && color[8] == 'B'){
                fullColor.blue(funcsqr);
            }
            if(color[3] == 'B' && color[6] == 'B'){
                fullColor.blue(funcsqr);
            }
        }
        if(color[1] == 'B'){
            if(color[4] == 'B' && color[7] == 'B'){
                fullColor.blue(funcsqr);
            }
        }
        if(color[2] == 'B'){
            if(color[5] == 'B' && color[8] == 'B'){
                fullColor.blue(funcsqr);
            }
            if(color[4] == 'B' && color[6] == 'B'){
                fullColor.blue(funcsqr);
            }
        }
        if(color[3] == 'B'){
            if(color[4] == 'B' && color[5] == 'B'){
                fullColor.blue(funcsqr);
            }
        }
        if(color[6] == 'B'){
            if(color[7] == 'B' && color[8] == 'B'){
                fullColor.blue(funcsqr);
            }
        }

        return funcsqr;
    }
}
