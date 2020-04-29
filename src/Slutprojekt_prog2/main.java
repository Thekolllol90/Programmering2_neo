package Slutprojekt_prog2;

import javafx.application.Application;
import javafx.stage.Stage;

public class main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        controller controller = new controller();
        controller.display(primaryStage);
    }
}
