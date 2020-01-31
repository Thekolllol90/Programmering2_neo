package Just_chilling;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class three_in_row extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        playGame(primaryStage);
    }

    public static void playGame(Stage primaryStage){

        display(primaryStage);
    }

    public static void display(Stage primaryStage){
        buttonLayout buttonLayout = new buttonLayout();
        StackPane view = new StackPane();
        view.getChildren().add(buttonLayout.layout());

        Scene scene = new Scene(view,300, 350);
        primaryStage.setTitle("3 in row");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
