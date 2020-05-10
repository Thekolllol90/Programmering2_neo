package Slutprojekt_prog2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class controller {
    public controller(){}

    private static Cell.cellType currentPlayer = Cell.cellType.x; //håller koll på vilken spelares tur det är, börjar med x

    public static void display(Stage primaryStage){
        boolean play = false; //skulle vara till något används inte

        Cell[] cells = new Cell[3*3]; //gör 3*3 med cells

        VBox rows = new VBox();
        for(int x = 0; x < 3; x++){ //gör tre rader
            HBox row = new HBox();
            for(int y = 0; y < 3; y++){ // gör tre kolumner
                Button button = new Button();

                Cell cell = new Cell(button, Cell.cellType.empty); //gör så att alla knappar är empty

                button.setOnAction(event -> { //vad som händer när man klickar på en knapp
                    if (cell.isEmpty()) //kollar om knappen är empty
                        cell.setType(currentPlayer); //gör knappen till den activa spelaren x eller o

                    boolean playerWon = check.checkWin(cells, currentPlayer); //kallar på en method för att kolla om den activa spelaren har vunnit
                    if(playerWon){
                        colorWin.color(cells, currentPlayer); // om spelaren har vunnit så målar den alla knappar till den activa spelarens färg
                    }

                    if (cell.getType() == Cell.cellType.x) { //om knappen är spelare x knap målas den med färg 1
                        button.setBackground(new Background(new BackgroundFill(Slutprojekt_prog2.startMeny.getColor1(), CornerRadii.EMPTY, Insets.EMPTY)));
                        currentPlayer = Cell.cellType.o; // byter den activa spelaren
                    } else if (cell.getType() == Cell.cellType.o){ //om knappen är spelare o knap målas den med färg 2
                        button.setBackground(new Background(new BackgroundFill(Slutprojekt_prog2.startMeny.getColor2(), CornerRadii.EMPTY, Insets.EMPTY)));
                    currentPlayer = Cell.cellType.x;
                }

                });

                button.setMinWidth(100.0f);
                button.setMinHeight(100.0f);

                cells[x + y * 3] = cell; //låter än lägga alla knappr 3*3

                row.getChildren().add(button);
            }

            rows.getChildren().add(row);
        }

        StackPane view = new StackPane();
        view.getChildren().add(rows);

        Scene scene = new Scene(view,300, 300);
        primaryStage.setTitle("Three in a row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
