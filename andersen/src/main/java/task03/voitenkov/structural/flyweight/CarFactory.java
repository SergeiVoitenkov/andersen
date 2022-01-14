package task03.voitenkov.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {
    private static final Map<String, Car> cars = new HashMap<>();

    public Car getCarByModel(String model) {
        Car car = cars.get(model);

        if (car == null) {
            switch (model) {
                case "BMW":
                    System.out.println("Автомобиль BMW разработан.");
                    car = new BMW();
                    break;
                case "Mercedes":
                    System.out.println("Автомобиль Mercedes разработан.");
                    car = new Mercedes();
            }
            cars.put(model, car);
        }
        return car;
    }

}
