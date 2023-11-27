package com.zergatstage.s01.modelelements;

import java.util.List;

public class Polygon {
    public final List<Point3D> points;

    public Polygon(List<Point3D> points) {
        this.points = points;
    }

    public List<Point3D> getPoints() {
        return this.points;
    }
}
