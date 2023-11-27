package com.zergatstage.s01.modelelements;

public interface ObjectTransformation {
    /**
     * Transforms the object by changing the angle
     * @param angle New angles for the object
     */
    void rotate(Angle3D angle);

    /**
     * Transforms the object by changing the coordinates point
     * @param point New point
     */
    void move(Point3D point);
}
