package Slutprojekt_prog2;

import javafx.geometry.Insets;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class colorWin {
    public colorWin (){}

    public static void color(cell[] cells, cell.cellType player){
        Color color = null;
        if(player == Slutprojekt_prog2.cell.cellType.x){
            color = Color.RED;
        } else if(player == Slutprojekt_prog2.cell.cellType.o){
            color = Color.BLUE;
        }

        for(int i = 0; i < 9; i++){
            cells[i].getButton().setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
        }
    }
}
