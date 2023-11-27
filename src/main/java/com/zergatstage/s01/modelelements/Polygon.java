package com.zergatstage.s01.modelelements;

import java.util.List;

public class Polygon {
    public List<Point3D> points;

    public Polygon(){}

    public List<Point3D> getPoints(){
        return this.points;
    }

    public void setPoints(List<Point3D> points){
        this.points = points;
    }
}
