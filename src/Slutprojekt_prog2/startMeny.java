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

    private static Color color1 = Color.RED; //skapar en color variabel som kan ändras från lite var som helst
    private static Color color2 = Color.BLUE;

    public static Color getColor1(){ // gör så man kan hämta color variabeln från en annan klass
        return color1;
    }

    public static Color getColor2(){
        return color2;
    }

    public static boolean menu(Stage primaryStage){
        AtomicBoolean game = new AtomicBoolean(false); //skulle användas till att tvinga spelaren välja en färg men då jag inte fick det att funka så används den inte

        Text t =  new Text(); // en text bit
        t.setText("Press play or change colors with button on the bottom");

        Button play = new Button(); // en knapp som startar spelet när man trycker på den
        play.setMinWidth(150.0f);
        play.setMinHeight(150.0f);
        play.setOnAction(event -> {
            controller.display(primaryStage); // startar spelet
        });

        HBox hBox1 = new HBox(); // boxar som används för att kunna lägga knappar och boxar rätt
        HBox hBox2 = new HBox();
        VBox vBox = new VBox();

        Button colors1 = new Button();
        Rectangle sqr1 = new Rectangle(); // knapp och rutor
        Rectangle sqr2 = new Rectangle();
        Rectangle sqr3 = new Rectangle();
        Rectangle sqr4 = new Rectangle();

        colors1.setOnAction(event -> { // knappen byter fägern på color variabeln
            color1 = Color.GREEN;
            color2 = Color.PURPLE;
        });

        sqr1.setFill(Color.RED); //ger rutorna färg
        sqr2.setFill(Color.BLUE);
        sqr3.setFill(Color.GREEN);
        sqr4.setFill(Color.PURPLE);

        Button[] buttons = {colors1};
        Rectangle[] squares = {sqr1, sqr2, sqr3, sqr4};

        hBox1.getChildren().addAll(colors1); //lägger till allt i fönstret
        hBox2.getChildren().addAll(sqr1, sqr2, sqr3, sqr4);
        vBox.getChildren().addAll(hBox1, hBox2);

        for(int i = 0; i < buttons.length; i++){ //storlek på knapp och rutorna
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

        Scene scene = new Scene(view,600, 600); //skapar och visar ett fönster
        primaryStage.setTitle("Three in a row");
        primaryStage.setScene(scene);
        primaryStage.show();

        return false; //behövs inte methoden borde vara void
    }
}
