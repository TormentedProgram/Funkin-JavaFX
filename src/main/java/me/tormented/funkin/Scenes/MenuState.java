package me.tormented.funkin.Scenes;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import me.tormented.funkin.Utils.Paths;
import me.tormented.funkin.Scenes.Objects.PlayScene;
import me.tormented.funkin.Scenes.Objects.SceneController;

public class MenuState extends PlayScene {
    public MenuState() {
        super(Color.WHITE);

        ImageView image = new ImageView(Paths.image("icon.png"));
        image.setX(500);
        image.setOnMousePressed(event -> {
            SceneController.switchTo(new PlayState());
        });
        add(image);
    }

    @Override
    public void onUpdate(double deltaTime) {

    }

    @Override
    public void onCreate() {

    }
}
