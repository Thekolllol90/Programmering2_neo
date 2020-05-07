package Slutprojekt_prog2;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class colorWin {
    public colorWin (){}

    public static void color(Cell[] Cells, Cell.cellType player){
        Color color = null;
        if(player == Cell.cellType.x){
            color = Color.RED;
        } else if(player == Cell.cellType.o){
            color = Color.BLUE;
        } else{
            color = Color.BLACK;
        }

        for(int i = 0; i < 9; i++){
            Cells[i].getButton().setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
            Cells[i].getButton().setOnAction(event -> {
                event.consume();
            });
        }
    }
}
