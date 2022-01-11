package task03.creational.pattern.factory_method.car;

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
