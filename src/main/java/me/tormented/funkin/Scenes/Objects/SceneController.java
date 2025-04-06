package me.tormented.funkin.Scenes.Objects;

import javafx.stage.Stage;

public class SceneController {
    private static Stage stage;
    private static PlayScene previousScene;

    public static void initializePrimaryStage(Stage primaryStage) {
        stage = primaryStage;
    }

    public static void switchTo(PlayScene scene) {
        if (stage == null) {
            throw new IllegalStateException("Stage not set. Call initializePrimaryStage() first.");
        }

        if (previousScene != null) {
            previousScene.stopAnimation();
        }

        System.out.println("Switching to scene: " + scene.getClass().getSimpleName());
        stage.setScene(scene);
        stage.show();
        previousScene = scene;
        scene.startAnimation();
    }
}
