package com.zergatstage.s01.modelelements;

import java.util.ArrayList;
import java.util.List;

/**
 * To the homework quiz
 */
public class Scene {
    private static int counter = 100;
    private final int id;
    private final List<PolygonalModel> models;
    private final List<Camera> cameras;
    private List<Flash> flashes;

    /**
     * Scene builder, that shows aggregations of various types - 1..*, 0..*
     *
     * @param models  List of models, not null.
     * @param cameras List of cameras not null.
     */
    public Scene(List<PolygonalModel> models, List<Camera> cameras) {
        if (models.isEmpty() || cameras.isEmpty())
            throw new IllegalArgumentException("Attributes of scene must be declared!");
        id = ++counter;
        this.models = models;
        this.cameras = cameras;
    }

    /**
     * Does something strange, but does
     *
     * @param angle old Angle
     * @return new Angle corrected on Scene models vectors
     */
    public Angle3D correctionAngleWithScene(Angle3D angle) {
        PolygonalModel model = this.models.get(0);
        Vector3D v1 = angle.getVector1();
        Vector3D v2 = angle.getVector2();
        return new Angle3D(v1, v2);
    }

    /**
     * Does something more strange as another one method. Just filler to the schema
     *
     * @param angle Current angle
     * @param color Current color
     * @return new polygonModel based on fake statements
     */
    public PolygonalModel correctionAngleWithSceneAndColor(Angle3D angle, Color color) {
        List<Polygon> polygons = new ArrayList<>();
        for (PolygonalModel models :
                this.models) {
            polygons.addAll(models.polygons);
        }
        return new PolygonalModel(polygons);
    }

    public int getId() {
        return id;
    }

    public List<PolygonalModel> getModels() {
        return models;
    }

    public List<Flash> getFlashes() {
        return flashes;
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
    }

    public List<Camera> getCameras() {
        return cameras;
    }
}