package com.zergatstage.s01.modelelements;

/**
 * POJO homework quiz
 */
public class Camera implements ObjectTransformation {
    private static int counter = 800;
    private final int id;
    private Point3D location;
    private Angle3D angle;
    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
        id = ++counter;
    }

    public int getId() {
        return id;
    }

    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    public void move(Point3D point) {
        this.location = point;
    }

}
