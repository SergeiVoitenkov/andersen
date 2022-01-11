package task03.creational.pattern.factory_method.car;

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
