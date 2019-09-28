package v39;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.text.Text;

public class läxa_flagga extends Application {
    public static void main(String[] args) { launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception{
        int flag = 0;
        Button btn = new Button();
        btn.setText("Sweden");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                int flag = 1;
            }
        });
        System.out.println(flag);



    }
    private static int pick(int flag,  Stage primaryStage) throws Exception{
        int res = 0;
        Text text = new Text("Välj en flagga!");
        text.setX(50);
        text.setY(50);



        Group group = new Group();
        Scene scene = new Scene(group, 600, 300);

        primaryStage.setTitle("flaggor");
        primaryStage.setScene(scene);
        primaryStage.show();

        return res;
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
        primaryStage.setTitle("flaggor");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_2(Stage primaryStage) throws Exception{
        Rectangle right = new Rectangle();
        Rectangle mid = new Rectangle();
        Rectangle left = new Rectangle();

        right.setHeight(300.0f);
        right.setWidth(200.0f);
        right.setFill(Color.BLACK);

        mid.setHeight(300.0f);
        mid.setWidth(200.0f);
        mid.setFill(Color.YELLOW);

        left.setHeight(300.0f);
        left.setWidth(200.0f);
        left.setFill(Color.RED);

        BorderPane tys = new BorderPane();
        tys.setRight(left);
        tys.setCenter(mid);
        tys.setLeft(right);

        Scene scene = new Scene(tys, 600, 300);
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

        StackPane nor = new StackPane(back);
        nor.getChildren().add(left);
        nor.getChildren().add(mid);
        nor.getChildren().add(front_left);
        nor.getChildren().add(front_mid);


        Scene scene = new Scene(nor, 600, 300);
        primaryStage.setTitle("flaggor");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_4(Stage primaryStage) throws Exception{
        Rectangle top = new Rectangle();
        Rectangle mid = new Rectangle();
        Rectangle bot = new Rectangle();

        top.setHeight(100.0f);
        top.setWidth(600.0f);
        top.setFill(Color.RED);

        mid.setHeight(100.0f);
        mid.setWidth(600.0f);
        mid.setFill(Color.WHITE);

        bot.setHeight(100.0f);
        bot.setWidth(600.0f);
        bot.setFill(Color.BLUE);

        BorderPane fra = new BorderPane();
        fra.setTop(top);
        fra.setCenter(mid);
        fra.setBottom(bot);

        Scene scene = new Scene(fra, 600, 300);
        primaryStage.setTitle("flaggor");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
 }
