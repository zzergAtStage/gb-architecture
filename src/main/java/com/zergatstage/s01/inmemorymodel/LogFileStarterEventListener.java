package com.zergatstage.s01.inmemorymodel;

public class LogFileStarterEventListener implements iModelChangedObserver{
    @Override
    public void ApplyUpdateModel(String operation) {
        System.out.printf("Logger starts log by event %s ...\n",operation);
    }
}
