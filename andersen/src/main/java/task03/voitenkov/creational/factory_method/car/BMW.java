package task03.voitenkov.creational.factory_method.car;

public class BMW implements Car {
    @Override
    public void drive() {
        System.out.println("Автомобиль BMW поехал.");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль BMW остановился.");
    }
}
