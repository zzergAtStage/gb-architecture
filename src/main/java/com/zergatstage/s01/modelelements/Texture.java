package com.zergatstage.s01.modelelements;

import java.awt.*;
import java.awt.image.ImageObserver;

/**
 * Fake realisation of class-stub. Class is the stub for Polygon class
 */
public class Texture {
    private ImageObserver imageObserver;

    private final int imageWidth;

    private final int imageHeight;

    public Texture(Image image) {
        imageObserver = (img, infoflags, x, y, width, height) -> false;
        imageWidth = image.getWidth(imageObserver);
        imageHeight = image.getHeight(imageObserver);
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }
}
