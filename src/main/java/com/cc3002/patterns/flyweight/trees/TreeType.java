package com.cc3002.patterns.flyweight.trees;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class TreeType {
    private String name;
    private Color color;
    private String otherTreeData;

    TreeType(String name, Color color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    void draw(GraphicsContext gc, int x, int y) {
        gc.setFill(Color.BLACK);
        gc.fillRect(x - 1, y, 3, 5);
        gc.setFill(color);
        gc.fillOval(x - 5, y - 10, 10, 10);
    }
}
