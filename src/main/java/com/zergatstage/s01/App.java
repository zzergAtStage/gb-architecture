package com.zergatstage.s01;

import com.zergatstage.s01.inmemorymodel.EmailEventListener;
import com.zergatstage.s01.inmemorymodel.LogFileStarterEventListener;
import com.zergatstage.s01.inmemorymodel.ModelStore;
import com.zergatstage.s01.modelelements.Angle3D;
import com.zergatstage.s01.modelelements.Camera;
import com.zergatstage.s01.modelelements.Point3D;
import com.zergatstage.s01.modelelements.Vector3D;

import java.util.List;

public class App {
    public static void main(String[] args) {
        ModelStore store = new ModelStore();

        LogFileStarterEventListener listener1 = new LogFileStarterEventListener();
        EmailEventListener listener2 = new EmailEventListener();

        store.addSubscriber(listener1);
        store.addSubscriber(listener2);

        Point3D point = new Point3D(4, -2, 2);
        Vector3D v1 = new Vector3D(new Point3D(2, 1, 5));
        Vector3D v2 = new Vector3D(new Point3D(4, -4, 3));
        Camera defaultCamera = new Camera(point, new Angle3D(v1, v2));
        //action
        store.setCameras(List.of(defaultCamera));
    }
}
