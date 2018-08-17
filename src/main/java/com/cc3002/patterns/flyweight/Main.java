package com.cc3002.patterns.flyweight;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private static int SIZE = 1000;
    private static int TREES = 100000;
    private static int TREE_TYPES = 2;

    @Override
    public void start(Stage primaryStage) {
        Forest forest = new Forest();
        for (int i = 0; i < Math.floor((float) TREES / TREE_TYPES); i++) {
            forest.plantTree(random(0, SIZE), random(0, SIZE), "Tree 1", Color.GREEN, "Tree 1 texture");
            forest.plantTree(random(0, SIZE), random(0, SIZE), "Tree 2", Color.ORANGE, "Tree 2 texture");
        }

        primaryStage.setTitle("Drawing a Forest");
        Group root = new Group();
        Canvas canvas = new Canvas(SIZE, SIZE);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        forest.draw(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
