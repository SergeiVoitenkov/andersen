package task03.creational.pattern.abstract_factory.car;

import task03.creational.pattern.abstract_factory.transport_interface.Car;

/**
 * CarFactory - singleton.
 * Method getCar - factory.
 * Нам известен интерфейс, но заранее не известно, какая реализация будет использоваться.
 * Создание объекта происходит через вызов метода в который передается условие(параметр).
 */
public class CarFactory {

    public static CarFactory instance;

    public static CarFactory getInstance() {
        if (instance == null) {
            instance = new CarFactory();
        }
        return instance;
    }

    private CarFactory() {
    }

    public Car getCar(CarModel carModel) {
        Car car = null;
        switch (carModel) {
            case BMW:
                car = new BMW();
                break;
            case MERCEDES:
                car = new Mercedes();
                break;
            default:
                System.out.println("Error: такой автомобиль отсутствует!");
                break;
        }
        return car;
    }
}