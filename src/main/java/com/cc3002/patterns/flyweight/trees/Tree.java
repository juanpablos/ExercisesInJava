package com.cc3002.patterns.flyweight.trees;


import javafx.scene.canvas.GraphicsContext;

public class Tree {
    private int x, y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(GraphicsContext gc) {
        type.draw(gc, x, y);
    }
}
