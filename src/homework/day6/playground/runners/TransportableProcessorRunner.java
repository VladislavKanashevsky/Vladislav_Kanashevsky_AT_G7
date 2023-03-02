package day6.playground.runners;

import day6.playground.essence.Flyable;
import day6.playground.essence.craft.Rideable;
import day6.playground.essence.craft.Transportable;
import day6.playground.essence.craft.air.Aircraft;
import day6.playground.essence.craft.air.Copter;
import day6.playground.essence.craft.air.Plane;
import day6.playground.essence.craft.air.Rocket;
import day6.playground.essence.craft.field.Car;
import day6.playground.essence.craft.field.Moped;
import day6.playground.essence.craft.field.Motorbike;
import day6.playground.essence.craft.field.Vehicle;
import day6.playground.processors.TransportableProcessor;

public class TransportableProcessorRunner {

    public static void main(String[] args) {

        TransportableProcessor transportableProcessor = new TransportableProcessor();
        Transportable transportableCopter = new Copter(223, "AW109 Transportable");
        Transportable transportablePlane = new Plane(3452, "Airbus a380 Transportable");
        Transportable transportableRocket = new Rocket(7623, "Soyuz-FG Transportable");
        Transportable transportableCar = new Car(23, "Tesla X Transportable");
        Transportable transportableMoped = new Moped(12, "Honda EM1 Transportable");
        Transportable transportableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Transportable");
        Aircraft aircraftCopter = new Copter(223, "AW109 Aircraft");
        Aircraft aircraftPlane = new Plane(3452, "Airbus a380 Aircraft");
        Aircraft aircraftRocket = new Rocket(7623, "Soyuz-FG Aircraft");
        Vehicle vehicleCar = new Car(23, "Tesla X AirVehicle");
        Vehicle vehicleMoped = new Moped(12, "Honda EM1 AirVehicle");
        Vehicle vehicleMotorbike = new Motorbike(12, "Suzuki GSX-R1000 AirVehicle");
        Flyable flyableCopter = new Copter(223, "AW109 Flyable");
        Flyable flyablePlane = new Plane(3452, "Airbus a380 Flyable");
        Flyable flyableRocket = new Rocket(7623, "Soyuz-FG Flyable");
        Rideable rideableCar = new Car(23, "Tesla X Rideable");
        Rideable rideableMoped = new Moped(12, "Honda EM1 Rideable");
        Rideable rideableMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Rideable");
        Copter aCopter = new Copter(223, "AW109 Copter");
        Plane aPlane = new Plane(3452, "Airbus a380 Plane");
        Rocket aRocket = new Rocket(7623, "Soyuz-FG Rocket");
        Car aCar = new Car(23, "Tesla X Car");
        Moped aMoped = new Moped(12, "Honda EM1 Moped");
        Motorbike aMotorbike = new Motorbike(12, "Suzuki GSX-R1000 Motorbike");

        transportableProcessor.runTransportable(transportableCopter);
        System.out.println();
        transportableProcessor.runTransportable(transportablePlane);
        System.out.println();
        transportableProcessor.runTransportable(transportableRocket);
        System.out.println();
        transportableProcessor.runTransportable(transportableCar);
        System.out.println();
        transportableProcessor.runTransportable(transportableMoped);
        System.out.println();
        transportableProcessor.runTransportable(transportableMotorbike);
        System.out.println();
        transportableProcessor.runTransportable(aircraftCopter);
        System.out.println();
        transportableProcessor.runTransportable(aircraftPlane);
        System.out.println();
        transportableProcessor.runTransportable(aircraftRocket);
        System.out.println();
        transportableProcessor.runTransportable(vehicleCar);
        System.out.println();
        transportableProcessor.runTransportable(vehicleMoped);
        System.out.println();
        transportableProcessor.runTransportable(vehicleMotorbike);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) flyableCopter);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) flyablePlane);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) flyableRocket);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) rideableCar);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) rideableMoped);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) rideableMotorbike);
        System.out.println();
        transportableProcessor.runTransportable(aCopter);
        System.out.println();
        transportableProcessor.runTransportable(aPlane);
        System.out.println();
        transportableProcessor.runTransportable(aRocket);
        System.out.println();
        transportableProcessor.runTransportable(aCar);
        System.out.println();
        transportableProcessor.runTransportable(aMoped);
        System.out.println();
        transportableProcessor.runTransportable(aMotorbike);
        System.out.println();

        transportableProcessor.runTransportable((Transportable) flyableCopter, 23, 243);
        System.out.println();
        transportableProcessor.runTransportable((Transportable) flyablePlane, 93, 7);
    }
}
