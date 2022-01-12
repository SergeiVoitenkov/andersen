package task03.voitenkov.creational.abstract_factory.car;

import task03.voitenkov.creational.abstract_factory.transport_interface.Car;

public class Mercedes implements Car {
    @Override
    public void drive() {
        System.out.println("Автомобиль Mercedes поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль Mercedes остановился.");
    }
}