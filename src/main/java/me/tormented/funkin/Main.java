package me.tormented.funkin;

import javafx.application.Application;
import javafx.stage.Stage;
import me.tormented.funkin.Scenes.Objects.SceneController;
import me.tormented.funkin.Scenes.PlayState;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setResizable(false);
        stage.setTitle("Stage Demo Program");
        stage.setWidth(1280);
        stage.setHeight(720);
        SceneController.initializePrimaryStage(stage);
        SceneController.switchTo(new PlayState());
    }
}