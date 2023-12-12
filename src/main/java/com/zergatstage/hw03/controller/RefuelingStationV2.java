package com.zergatstage.hw03.controller;

import com.zergatstage.hw03.model.FuelType;
import com.zergatstage.hw03.model.Refueling;

public class RefuelingStationV2 implements Refueling {

    public void processCarFuel(FuelType fuelType) {
        switch (fuelType){
            case Diesel -> System.out.println("Заправка дизельным топливом");
            case Gasoline -> System.out.println("Заправка бензином");
        }
    }

    @Override
    public void fuel(FuelType fuelType) {
        processCarFuel(fuelType);
    }
}
