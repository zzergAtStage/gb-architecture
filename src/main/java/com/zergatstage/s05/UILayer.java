package com.zergatstage.s05;

public interface UILayer {

    void openProject(String fileName);
    void showProjectSettings();

    void saveProject();

    void printAllModels();

    void printAllTextures();

    void renderAll();
    void renderModel(int i);

}
