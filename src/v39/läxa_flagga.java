package v39;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class läxa_flagga extends Application {
    public static void main(String[] args) { launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception{
        String name = "";

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
        primaryStage.setTitle(name);

        primaryStage.setScene(scene);

        primaryStage.show();
    }
    private static void flagga_1(){

    }
}
