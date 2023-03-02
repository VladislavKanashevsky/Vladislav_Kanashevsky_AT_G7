package day6.playground.processors;

import day6.playground.essence.craft.Transportable;
import day6.playground.utils.CoordinatesGenerator;

public class TransportableProcessor {

    public void runTransportable(Transportable transportable, int pointA, int pointB) {
        transportable.move(pointA, pointB);
    }

    public void runTransportable(Transportable transportable) {
        transportable.move(CoordinatesGenerator.generateCoordinate());
    }
}
