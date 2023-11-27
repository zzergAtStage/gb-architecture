package com.zergatstage.s01.modelelements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {
    private static int counter = 200;
    public final List<Polygon> polygons; //composition field
    public List<Texture> textures = new ArrayList<>();//aggregation
    private int id;

    public PolygonalModel(List<Polygon> polygons) {
        if (polygons == null || polygons.isEmpty()) throw new IllegalArgumentException("Polygons must be!");
        id = ++counter;
        this.polygons = polygons; //Composition - can be null, but can not be not initialized
    }

    public List<Texture> getTextures() {
        return textures;
    }

    public void setTextures(List<Texture> textures) {
        this.textures = textures;
    }

    public List<Polygon> getPolygons() {
        return polygons;
    }

}
