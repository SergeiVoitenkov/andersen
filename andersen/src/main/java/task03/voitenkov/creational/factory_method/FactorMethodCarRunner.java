package task03.voitenkov.creational.factory_method;

import task03.voitenkov.creational.factory_method.car.Car;
import task03.voitenkov.creational.factory_method.car.CarFactory;
import task03.voitenkov.creational.factory_method.car.CarModel;

public class FactorMethodCarRunner {
    public static void main(String[] args) {
        Car car = CarFactory.getInstance().getCar(CarModel.BMW);
        car.drive();
        car.stop();
    }
}
