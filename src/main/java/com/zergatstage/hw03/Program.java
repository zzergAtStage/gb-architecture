package com.zergatstage.hw03;

import java.awt.*;

import com.zergatstage.hw03.cars.SportCar;
import com.zergatstage.hw03.controller.RefuelingStation;
import com.zergatstage.hw03.controller.ServiceStation;
import com.zergatstage.hw03.model.Car;
import com.zergatstage.hw03.model.CarType;
import com.zergatstage.hw03.model.FuelType;
import com.zergatstage.hw03.model.GearBox;
import com.zergatstage.hw03.model.GearboxType;

public class Program {


    public static void main(String[] args) {
        SportCar sportCar = SportCar.create("A", "B", Color.BLACK, 3);
        RefuelingStation refuelingStation = new RefuelingStation();
        sportCar.setRefuelingStation(refuelingStation);
        sportCar.fuel();
        
        SportCar ferrari = SportCar.create("Ferrari", "433", new Color(255,0,0));
        ferrari.setCarType(CarType.Sport);// Main Car class doesn't have setters originally.
        ServiceStation jugService = new ServiceStation();
        jugService.setLocalRefuelingService(refuelingStation);
        
        jugService.getCarToTheService(ferrari);
        //both of these actions throws an errors
        try {
	        jugService.changeGearBox(ferrari, new GearBox(GearboxType.AT, "ZahnRadFabric"));
	        jugService.fuel(FuelType.Diesel);
        } catch (RuntimeException e) {
        	System.out.println(e);
        }
        
        jugService.changeGearBox(ferrari, new GearBox(GearboxType.MT, "ZahnRadFabric"));
        jugService.fuel(FuelType.Gasoline);
        

    }

    public static double calculateMaintenance(Car car){
        if (car.getWheelsCount() == 6){
            return 1500 * 6;
        }
        else {
            return 1000 * 4;
        }
    }

}
