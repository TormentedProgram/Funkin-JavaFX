package me.tormented.funkin.Scenes.Objects;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public abstract class PlayScene extends Scene {
    private final Group root;
    private AnimationTimer animationTimer;

    protected PlayScene(Color color) {
        super(new Group());
        this.root = (Group) getRoot();
    }

    public void startAnimation() {
        onCreate();
        animationTimer = new AnimationTimer() {
            private long lastTime = -1;

            @Override
            public void handle(long now) {
                if (lastTime < 0) {
                    lastTime = now;
                    return;
                }

                double deltaTime = (now - lastTime) / 1_000_000_000.0; // convert nanoseconds to seconds
                lastTime = now;

                onUpdate(deltaTime);
            }
        };

        animationTimer.start();
    }

    public void stopAnimation() {
        if (animationTimer != null) {
            animationTimer.stop();
        }
    }

    protected void add(Node node) {
        root.getChildren().add(node);
    }

    protected abstract void onUpdate(double deltaTime);

    protected abstract void onCreate();
}
