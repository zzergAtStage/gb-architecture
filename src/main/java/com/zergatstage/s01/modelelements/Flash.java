package com.zergatstage.s01.modelelements;

public class Flash implements ObjectTransformation{
    private int id;
    private static int counter = 500;
    private Point3D location;

    private Angle3D angle;
    private Color color;
    protected float power;

    public Flash(Point3D location, Angle3D angle, Color color, float power) {
        this.location = location;
        this.angle = angle;
        this.color = color;
        this.power = power;
        id = ++counter;
    }

    /**
     * Transforms the object by changing the angle
     *
     * @param angle New angles for the object
     */
    @Override
    public void rotate(Angle3D angle) {
        this.angle = angle;
    }

    /**
     * Transforms the object by changing the coordinates point
     *
     * @param point New point
     */
    @Override
    public void move(Point3D point) {
        this.location = point;
    }

    public Point3D getLocation() {
        return location;
    }

    public Angle3D getAngle() {
        return angle;
    }

    public Color getColor() {
        return color;
    }

    public float getPower() {
        return power;
    }
}
