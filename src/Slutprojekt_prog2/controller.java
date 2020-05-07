package Slutprojekt_prog2;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class controller {
    public controller(){}

    private static Cell.cellType currentPlayer = Cell.cellType.x;

    public static void display(Stage primaryStage){
        boolean play = false;

        Cell[] cells = new Cell[3*3];

        VBox rows = new VBox();
        for(int x = 0; x < 3; x++){
            HBox row = new HBox();
            for(int y = 0; y < 3; y++){
                Button button = new Button();

                Cell cell = new Cell(button, Cell.cellType.empty);

                button.setOnAction(event -> {
                    if (cell.isEmpty())
                        cell.setType(currentPlayer);

                    boolean playerWon = check.checkWin(cells, currentPlayer);
                    if(playerWon){
                        colorWin.color(cells, currentPlayer);
                    }

                    if (cell.getType() == Cell.cellType.x) {
                        button.setBackground(new Background(new BackgroundFill(Color.RED, CornerRadii.EMPTY, Insets.EMPTY)));
                        currentPlayer = Cell.cellType.o;
                    } else if (cell.getType() == Cell.cellType.o){
                        button.setBackground(new Background(new BackgroundFill(Color.BLUE, CornerRadii.EMPTY, Insets.EMPTY)));
                    currentPlayer = Cell.cellType.x;
                }

                });

                button.setMinWidth(100.0f);
                button.setMinHeight(100.0f);

                cells[x + y * 3] = cell;

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
