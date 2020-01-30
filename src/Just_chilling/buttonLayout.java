package Just_chilling;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class buttonLayout {
    public buttonLayout(){}

    public static VBox layout(){
        buttons buttons = new buttons();
        Button[] squares = buttons.buttonFunction();

        for(int i = 0; i < squares.length; i++){
            squares[i].setMinWidth(100.0f);
            squares[i].setMinHeight(100.0f);
            if(i == 9){
                squares[i].setMaxWidth(300.0f);
                squares[i].setMinHeight(50.0f);
                squares[i].setText("Reset");
            }
        }

        HBox row1 = new HBox();
        row1.getChildren().addAll(squares[0], squares[1], squares[2]);

        HBox row2 = new HBox();
        row2.getChildren().addAll(squares[3], squares[4], squares[5]);

        HBox row3 = new HBox();
        row3.getChildren().addAll(squares[6], squares[7], squares[8]);

        VBox layout = new VBox();
        layout.getChildren().addAll(squares[9],row1,row2,row3);

        return layout;
    }
}
