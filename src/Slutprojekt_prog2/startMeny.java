package Slutprojekt_prog2;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.concurrent.atomic.AtomicBoolean;



public class startMeny {
    public startMeny(){}

    private static Color color1;
    private static Color color2;

    public static boolean menu(Stage primaryStage){
        AtomicBoolean game = new AtomicBoolean(false);

        Text t =  new Text();
        t.setText("Press play or select colors");

        Button play = new Button();
        play.setMinWidth(150.0f);
        play.setMinHeight(150.0f);
        play.setOnAction(event -> {
            controller.display(primaryStage);
        });

        HBox hBox1 = new HBox();
        HBox hBox2 = new HBox();
        VBox vBox = new VBox();

        Button colors1 = new Button();
        Button colors2 = new Button();
        Rectangle sqr1 = new Rectangle();
        Rectangle sqr2 = new Rectangle();
        Rectangle sqr3 = new Rectangle();
        Rectangle sqr4 = new Rectangle();

        colors1.setOnAction(event -> {
            color1 = Color.RED;
            color2 = Color.BLUE;
        });

        colors2.setOnAction(event -> {
            color1 = Color.GREEN;
            color2 = Color.PURPLE;
        });

        sqr1.setFill(Color.RED);
        sqr2.setFill(Color.BLUE);
        sqr3.setFill(Color.GREEN);
        sqr4.setFill(Color.PURPLE);

        Button[] buttons = {colors1, colors2};
        Rectangle[] squares = {sqr1, sqr2, sqr3, sqr4};

        hBox1.getChildren().addAll(colors1, colors2);
        hBox2.getChildren().addAll(sqr1, sqr2, sqr3, sqr4);
        vBox.getChildren().addAll(hBox1, hBox2);

        for(int i = 0; i < buttons.length; i++){
            buttons[i].minWidth(200.0F);
            buttons[i].minHeight(200.0F);
        }
        for(int i = 0; i < squares.length; i++){
            squares[i].minWidth(200.0F);
            squares[i].minHeight(200.0F);
        }

        BorderPane meny = new BorderPane();
        meny.setTop(t);
        meny.setCenter(play);
        meny.setBottom(vBox);

        StackPane view = new StackPane();
        view.getChildren().add(meny);

        Scene scene = new Scene(view,600, 600);
        primaryStage.setTitle("Three in a row");
        primaryStage.setScene(scene);
        primaryStage.show();

        return false;
    }
}
