package V40;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;


public class ovning_lektion extends Application {
    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Label input = new Label();

        String[][] buttons = {
            { "1", "2", "3", "+" },
            { "4", "5", "6", "-" },
            { "7", "8", "9", "*"},
            { "C", "0", "=", "/"}
        };

        GridPane grid = new GridPane();

        final ColumnConstraints col = new ColumnConstraints(100, Control.USE_COMPUTED_SIZE, Control.USE_COMPUTED_SIZE);
        col.setHgrow(Priority.ALWAYS);
        grid.getColumnConstraints().addAll(col, col, col, col);


        grid.add(input, 0, 0, 4, 1);

        for(int y = 0; y < buttons.length; y++) {
            for(int x = 0; x < buttons[y].length; x++) {
                String name = buttons[y][x];
                Button button = new Button(name);
                button.setMinWidth(100);
                button.setOnAction(event -> {
                    if(name.equals("C"))
                        return;
                    String text = input.getText();
                    StringBuilder builder = new StringBuilder();
                    builder.append(text);
                    builder.append(name);
                    input.setText(builder.toString());
                });

                grid.add(button, x, y + 1);
            }
        }

        Rectangle rec = new Rectangle();

        rec.setHeight(600.0f);
        rec.setWidth(600.0f);
        rec.setFill(Color.BLACK);

        Group test = new Group(grid);
        Scene scene = new Scene(test, 600, 600);
        primaryStage.setTitle("Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

}
