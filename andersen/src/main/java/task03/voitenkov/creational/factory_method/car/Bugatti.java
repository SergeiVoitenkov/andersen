package task03.voitenkov.creational.factory_method.car;

public class Bugatti implements Car {
    @Override
    public void drive() {
        System.out.println("Автомобиль Bugatti поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль Bugatti остановился.");
    }
}
