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

        if(player == Cell.cellType.x){ // om det är spelare x som vunnit måla allt med den färgen
            color = Slutprojekt_prog2.startMeny.getColor1();
        } else if(player == Cell.cellType.o){ // måla med spelare o färg
            color = Slutprojekt_prog2.startMeny.getColor2();
        } else{
            color = Color.BLACK; // borde alldrig komma hit men man vet alldrig
        }

        for(int i = 0; i < 9; i++){ // gör alla knappar till en färg och gör så att alla knappar slutar funka
            Cells[i].getButton().setBackground(new Background(new BackgroundFill(color, CornerRadii.EMPTY, Insets.EMPTY)));
            Cells[i].getButton().setOnAction(event -> {
                event.consume();
            });
        }
    }
}
