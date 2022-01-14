package task03.akhmetkhanov.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Class represents a flyweight pattern.
 * Factory returns a car of definite colour from cache if it exists and creates a new one if it doesn't.
 */
public class VehicleFactory {
    private Map<String, Vehicle> vehicleCache = new HashMap<>();

    public Vehicle createVehicle(String colour) {
        /**
         * Method looks for car in cache and if it doesn't - creates a new one.
         */
        Vehicle newVehicle = vehicleCache.computeIfAbsent(colour, newColour -> {
            Engine engine = new Engine();
            return new Car(engine, newColour);
        });
        return newVehicle;
    }
}
