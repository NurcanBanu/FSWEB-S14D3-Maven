package org.example.arge;

import java.sql.SQLOutput;

public class CarFactory {

    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla", "charged", 850, 1500 );
        CarSkeleton hybridCar = new HybridCar("Toyota", "Prius", 25.0, 2000, 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Honda", "Civic", 30.0, 4);

        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);

    }

    public static void startEngine(CarSkeleton carSkeleton) {
        System.out.println(carSkeleton.startEngine());
    }

}
