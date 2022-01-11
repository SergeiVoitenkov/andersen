package task03.creational.pattern.factory_method.car;

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
            case BUGATTI:
                car = new Bugatti();
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
