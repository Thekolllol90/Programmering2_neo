package v39;

import javafx.application.Application; //importerar all skit som behövs för javafx
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


public class läxa_flagga extends Application {
    public static int flag = 0; // sätter en global variabel, i know vi ska inte ha de men va ända sättet jag kom på
    public static void main(String[] args) { launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception{
        pick(primaryStage); //kallar på methoden som låter en välja en flagga
    }

    private static void pick(Stage primaryStage) throws Exception{
        Button swe = new Button(); // skapar nya knappar
        Button tys = new Button();
        Button nor = new Button();
        Button fra = new Button();

        swe.setText("Sweden"); // sätter en text på knappen
        swe.setMinHeight(30); // sätter en storlek på knappen
        swe.setMinWidth(30);
        swe.setOnAction(new EventHandler<ActionEvent>() { //bestämer vad som händer när man klickar på knappen
            public void handle(ActionEvent event) {
                flag = 1; // ändrar variabeln som bestämer vilken flagga som ska visas
                try {
                    flagga(primaryStage); // kallar på methoden som kollar vilken flagga som ska visas
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        tys.setTranslateX(100.0f); // flyttar knappen så den syns
        tys.setText("Germany");
        tys.setMinHeight(30);
        tys.setMinWidth(30);
        tys.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                flag = 2;
                try {
                    flagga(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        nor.setTranslateX(200.0f);
        nor.setText("Norway");
        nor.setMinHeight(30);
        nor.setMinWidth(30);
        nor.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                flag = 3;
                try {
                    flagga(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        fra.setTranslateX(300.0f);
        fra.setText("France");
        fra.setMinHeight(30);
        fra.setMinWidth(30);
        fra.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                flag = 4;
                try {
                    flagga(primaryStage);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        Group box = new Group();

        box.getChildren().addAll(swe, tys, nor, fra); // lägger till alla knappar i box

        Scene scene = new Scene(box, 600, 300); // gör en sen med box i
        primaryStage.setTitle("chose"); // ger fönstret ett namn
        primaryStage.setScene(scene); //lägger in scene i fönstret
        primaryStage.show(); // visar fönstret
    }

    private static void flagga(Stage primaryStage) throws Exception{
        if(flag == 1){  // kollar vilken flagga som ska vissas och kallar på methoden som visar flaggan
            flagga_1(primaryStage);
        }else if(flag == 2){
            flagga_2(primaryStage);
        }else if (flag == 3){
            flagga_3(primaryStage);
        }else if(flag == 4){
            flagga_4(primaryStage);
        }else {
            System.out.println("Im a stupid bitch"); // för att veta om allt funkade eller inte
        }
    }

    private static void flagga_1(Stage primaryStage) throws Exception{
        Rectangle squ = new Rectangle(); // skapar rectanglar
        Rectangle rec = new Rectangle();
        Rectangle back = new Rectangle();

        back.setHeight(300.0f); // sätter höjden på rectangeln
        back.setWidth(600.0f); // sätter bredden på rectangeln
        back.setFill(Color.BLUE); // sätter färgen på rectangeln

        rec.setHeight(50.0f);
        rec.setWidth(600.0f);
        rec.setFill(Color.YELLOW);

        squ.setTranslateX(-100.0f);
        squ.setHeight(300.0f);
        squ.setWidth(50.0f);
        squ.setFill(Color.YELLOW);

        StackPane swe = new StackPane(back); // skapar en stackpane och lägger in backgrounden
        swe.getChildren().add(rec); // lägger till en rectangel i stackpane
        swe.getChildren().add(squ);

        Scene scene = new Scene(swe, 600, 300);
        primaryStage.setTitle("Sweden");

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

        BorderPane tys = new BorderPane(); //skapar en borderpane
        tys.setRight(left); // lägger till left på höger sida av bordepane, skrev fel namn orka inte byta
        tys.setCenter(mid); // lägger mid i mitten
        tys.setLeft(right); // lägger right till vänster

        Scene scene = new Scene(tys, 600, 300);
        primaryStage.setTitle("Germany");

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
        primaryStage.setTitle("Norway");

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
        primaryStage.setTitle("France");

        primaryStage.setScene(scene);

        primaryStage.show();
    }
 }
