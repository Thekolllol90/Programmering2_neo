package v39;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class läxa_flagga extends Application {
    public static void main(String[] args) { launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception{
        Rectangle front_left = new Rectangle();
        Rectangle left = new Rectangle();
        Rectangle front_mid = new Rectangle();
        Rectangle mid = new Rectangle();
        Rectangle back = new Rectangle();

        back.setHeight(300.0f);
        back.setWidth(600.0f);
        back.setFill(Color.RED);

        front_mid.setHeight(40.0f);
        front_mid.setWidth(600.0f);
        front_mid.setFill(Color.BLUE);

        mid.setHeight(50.0f);
        mid.setWidth(600.0f);
        mid.setFill(Color.WHITE);


        front_left.setTranslateX(-100.0f);
        front_left.setHeight(300.0f);
        front_left.setWidth(40.0f);
        front_left.setFill(Color.BLUE);

        left.setTranslateX(-100.0f);
        left.setHeight(300.0f);
        left.setWidth(50.0f);
        left.setFill(Color.WHITE);

        StackPane swe = new StackPane(back);
        swe.getChildren().add(left);
        swe.getChildren().add(mid);
        swe.getChildren().add(front_left);
        swe.getChildren().add(front_mid);


        Scene scene = new Scene(swe, 600, 300);
        primaryStage.setTitle("flagga 1");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_1(Stage primaryStage) throws Exception{
        Rectangle squ = new Rectangle();
        Rectangle rec = new Rectangle();
        Rectangle back = new Rectangle();

        back.setHeight(300.0f);
        back.setWidth(600.0f);
        back.setFill(Color.BLUE);

        rec.setHeight(50.0f);
        rec.setWidth(600.0f);
        rec.setFill(Color.YELLOW);

        squ.setTranslateX(-100.0f);
        squ.setHeight(300.0f);
        squ.setWidth(50.0f);
        squ.setFill(Color.YELLOW);

        StackPane swe = new StackPane(back);
        swe.getChildren().add(rec);
        swe.getChildren().add(squ);

        Scene scene = new Scene(swe, 600, 300);
        primaryStage.setTitle("flagga 1");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_2(Stage primaryStage) throws Exception{
        Rectangle right = new Rectangle();
        Rectangle mid = new Rectangle();
        Rectangle left = new Rectangle();

        right.setTranslateX(-200.0f);
        right.setHeight(300.0f);
        right.setWidth(200.0f);
        right.setFill(Color.BLACK);

        mid.setTranslateX(200.0f);
        mid.setHeight(300.0f);
        mid.setWidth(200.0f);
        mid.setFill(Color.YELLOW);

        left.setTranslateX(400.0f);
        left.setHeight(300.0f);
        left.setWidth(200.0f);
        left.setFill(Color.RED);

        BorderPane fra = new BorderPane(right);
        fra.getChildren().add(mid);
        fra.getChildren().add(left);

        Scene scene = new Scene(fra, 600, 300);
        primaryStage.setTitle("flaggor");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_3(Stage primaryStage) throws  Exception{
        Rectangle front_left = new Rectangle();
        Rectangle left = new Rectangle();
        Rectangle front_mid = new Rectangle();
        Rectangle mid = new Rectangle();
        Rectangle back = new Rectangle();

        back.setHeight(300.0f);
        back.setWidth(600.0f);
        back.setFill(Color.RED);

        front_mid.setHeight(40.0f);
        front_mid.setWidth(600.0f);
        front_mid.setFill(Color.BLUE);

        mid.setHeight(50.0f);
        mid.setWidth(600.0f);
        mid.setFill(Color.WHITE);


        front_left.setTranslateX(-100.0f);
        front_left.setHeight(300.0f);
        front_left.setWidth(40.0f);
        front_left.setFill(Color.BLUE);

        left.setTranslateX(-100.0f);
        left.setHeight(300.0f);
        left.setWidth(50.0f);
        left.setFill(Color.WHITE);

        StackPane swe = new StackPane(back);
        swe.getChildren().add(left);
        swe.getChildren().add(mid);
        swe.getChildren().add(front_left);
        swe.getChildren().add(front_mid);


        Scene scene = new Scene(swe, 600, 300);
        primaryStage.setTitle("flagga 1");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
 }
