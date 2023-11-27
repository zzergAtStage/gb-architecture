package com.zergatstage.s01.modelelements;

import java.util.ArrayList;
import java.util.List;

public class PolygonalModel {

    public List<Polygon> polygons = new ArrayList<>(); //aggregation

    public List<Texture> textures;

    public PolygonalModel(List<Texture> textures){
        this.textures = textures; //Composition - can be zero
    }

    public List<Texture> getTextures() {
        return textures;
    }
    public List<Polygon> getPolygons() {
        return polygons;
    }

}
