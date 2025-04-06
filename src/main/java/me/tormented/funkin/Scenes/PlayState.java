package me.tormented.funkin.Scenes;

import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import me.tormented.funkin.Scenes.Objects.PlayScene;
import me.tormented.funkin.Scenes.Objects.SceneController;
import me.tormented.funkin.Utils.Paths;

public class PlayState extends PlayScene {
    public PlayState() {
        super(Color.WHITE);

        ImageView image = new ImageView(Paths.image("icon.png"));
        image.setOnMousePressed(event -> {
            SceneController.switchTo(new MenuState());
        });
        add(image);
        setOnKeyPressed(event -> {
            System.out.println(event.getCode() + " key");
        });
    }

    @Override
    public void onUpdate(double deltaTime) {
        System.out.println("fungus");
    }

    @Override
    protected void onCreate() {

    }
}
