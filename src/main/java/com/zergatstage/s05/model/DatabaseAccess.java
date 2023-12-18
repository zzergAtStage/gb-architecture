package com.zergatstage.s05.model;

import com.zergatstage.s05.model.Entity;
import com.zergatstage.s05.model.Model3D;
import com.zergatstage.s05.model.Texture;

import java.util.Collection;

public interface DatabaseAccess {

    void addEntity(Entity entity);
    void removeEntity(Entity entity);
    Collection<Texture> getAllTextures();
    Collection<Model3D> getAllModels();
}
