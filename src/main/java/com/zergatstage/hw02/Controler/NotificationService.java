package com.zergatstage.hw02.Controler;

import com.zergatstage.hw02.Fabric.ObserverBureau;

import java.util.List;

public interface NotificationService {
    void addObserver(ObserverBureau observer);
    void removeObserver(ObserverBureau observerBureau);
    List<ObserverBureau> getObservers();

}
