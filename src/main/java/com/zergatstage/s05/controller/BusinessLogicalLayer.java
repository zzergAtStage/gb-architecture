package com.zergatstage.s05.controller;

import com.zergatstage.s05.model.Model3D;
import com.zergatstage.s05.model.Texture;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3D model);
    void renderAllModels();

}
