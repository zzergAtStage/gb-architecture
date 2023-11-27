package com.zergatstage.s01.inmemorymodel;

import com.zergatstage.s01.modelelements.Camera;
import com.zergatstage.s01.modelelements.Flash;
import com.zergatstage.s01.modelelements.PolygonalModel;
import com.zergatstage.s01.modelelements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger {
    private List<iModelChangedObserver> observers = new ArrayList<>();
    private List<PolygonalModel> models;
    private List<Scene> scenes;
    private List<Flash> flashes;
    private List<Camera> cameras;

    public ModelStore(List<PolygonalModel> models,
                      List<Scene> scenes, List<Flash> flashes,
                      List<Camera> cameras) {
        this.models = models;
        this.scenes = scenes;
        this.flashes = flashes;
        this.cameras = cameras;
    }
    public ModelStore(){

    }

    public void setModels(List<PolygonalModel> models) {
        this.models = models;
        notifyChanger("models");
    }

    public void setScenes(List<Scene> scenes) {
        this.scenes = scenes;
        notifyChanger("scenes");
    }

    public void setFlashes(List<Flash> flashes) {
        this.flashes = flashes;
        notifyChanger("flashes");
    }

    public void setCameras(List<Camera> cameras) {
        this.cameras = cameras;
        notifyChanger("cameras");
    }

    public Scene getScene(int sceneIndex) {
        return scenes.get(sceneIndex);
    }

    public Flash getFlash(int flashIndex) {
        return flashes.get(flashIndex);
    }

    public PolygonalModel getModel(int indexPolygonalModel) {
        return models.get(indexPolygonalModel);
    }

    public Camera getCamera(int indexCamera) {
        return cameras.get(indexCamera);
    }


    @Override
    public void notifyChanger(String event) {
        for (iModelChangedObserver observer :
                observers) {
            observer.ApplyUpdateModel(event);
        }
    }


    @Override
    public void addSubscriber(iModelChangedObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeSubscriber(iModelChangedObserver observer) {
        this.observers.remove(observer);
    }
}
