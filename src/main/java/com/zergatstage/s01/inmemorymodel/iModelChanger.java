package com.zergatstage.s01.inmemorymodel;

public interface iModelChanger {
    void notifyChanger(String event);
    void addSubscriber(iModelChangedObserver observer);
    void removeSubscriber(iModelChangedObserver observer);
}
