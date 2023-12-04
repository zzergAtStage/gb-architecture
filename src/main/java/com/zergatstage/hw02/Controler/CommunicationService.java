package com.zergatstage.hw02.Controler;

import com.zergatstage.hw02.Fabric.ObserverBureau;

import java.util.ArrayList;
import java.util.List;

public class CommunicationService implements NotificationService {
    private List<ObserverBureau> bureaus;

    CommunicationService(){
        bureaus = new ArrayList<>();
    }
    @Override
    public void addObserver(ObserverBureau observer) {
        bureaus.add(observer);
    }

    @Override
    public void removeObserver(ObserverBureau observerBureau) {
        bureaus.remove(observerBureau);
    }

    @Override
    public List<ObserverBureau> getObservers() {
        return bureaus;
    }
}
