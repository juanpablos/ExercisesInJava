package com.cc3002.patterns.adapter;

import java.awt.*;

public interface GImage {
    GColor getPixel(int x, int y);

    void setPixel(GColor c, int x, int y);

    int height();

    int width();

    void draw(Graphics g);
}

