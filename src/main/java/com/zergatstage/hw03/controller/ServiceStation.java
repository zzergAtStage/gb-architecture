package com.zergatstage.hw03.controller;

import java.util.ArrayList;
import java.util.List;

import com.zergatstage.hw03.model.Car;
import com.zergatstage.hw03.model.CarType;
import com.zergatstage.hw03.model.FuelType;
import com.zergatstage.hw03.model.GearBox;
import com.zergatstage.hw03.model.GearboxType;
import com.zergatstage.hw03.model.Refueling;
import com.zergatstage.hw03.model.Wiping;

public class ServiceStation implements Refueling, Wiping{
    
	//"has-a" relationship
	private List<Car> servicedCars = new ArrayList<>();
	private Refueling localRefuelingService;
	
	public void setLocalRefuelingService(Refueling localRefuelingService) {
		this.localRefuelingService = localRefuelingService;
	}
	public void getCarToTheService(Car car) {
		if (isThereEmptyPost()) {
			System.out.println("Getting the car: " + car.getMake() + " to the service");
			servicedCars.add(car);
		}
	}
	private boolean isThereEmptyPost() {
		if (servicedCars.isEmpty() ||servicedCars.size() == 0) return true;
		for (Car post : servicedCars) {
			return post == null;
		}
		return false;
	}
	public Car returnCarFromService(int serviceTicket) {
		try { return servicedCars.remove(serviceTicket);}
		catch (IndexOutOfBoundsException e) {
			System.out.println("There is now car with service ticket #" + serviceTicket);
			return null;
		}
	}
	
	public void changeGearBox(Car car, GearBox gearBox) {
		if (GearboxType.MT == gearBox.getType() && car.getCarType() == CarType.Sport) {
			System.out.println("New gearBox " + gearBox.getManufacturer() + " installed.");
		} else {
			System.out.println("Invalig kind of gearBox");
		}
	}
	
	@Override
    public void fuel(FuelType fuelType) {
		//support only sport HighOktane gasoline
		if (fuelType != FuelType.Gasoline) {
			throw new IllegalArgumentException("Refueling: Only sports car refueled!");
		} else {
			for (Car car : servicedCars) {
				car.setRefuelingStation(localRefuelingService);
				localRefuelingService.fuel(fuelType);
			}
		}
    }
    
    @Override
    public void wipMirrors() {

    }

    @Override
    public void wipWindshield() {

    }

    @Override
    public void wipHeadlights() {

    }
}
