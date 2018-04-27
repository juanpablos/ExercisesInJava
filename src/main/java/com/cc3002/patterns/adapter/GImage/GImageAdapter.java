package com.cc3002.patterns.adapter.GImage;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GImageAdapter implements GImage {

    private BufferedImage image;

    public GImageAdapter(Image img) {
        image = new BufferedImage(img.getWidth(null), img.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = image.getGraphics();
        g.drawImage(img, 0, 0, null);
    }

    public GImageAdapter(int width, int height) {
        image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
    }

    public int height() {
        return image.getHeight(null);
    }

    public int width() {
        return image.getWidth(null);
    }

    public void setPixel(GColor c, int x, int y) {
        Color javaColor = new Color(c.getRed(), c.getGreen(), c.getBlue());
        image.setRGB(x, y, javaColor.getRGB());
    }

    public GColor getPixel(int x, int y) {
        Color javaColor = new Color(image.getRGB(x, y));
        return new GColor(javaColor.getRed(),
                javaColor.getBlue(),
                javaColor.getGreen());
    }

    public void draw(Graphics g) {
        g.drawImage(image, 0, 0, null);
    }

}