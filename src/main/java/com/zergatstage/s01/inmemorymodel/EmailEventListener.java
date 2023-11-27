package com.zergatstage.s01.inmemorymodel;

public class EmailEventListener implements iModelChangedObserver{
    @Override
    public void ApplyUpdateModel(String event) {
        System.out.printf("Event listener gets update %s and sends...emails\n",event);
    }
}
