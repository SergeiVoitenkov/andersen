package task03.voitenkov.creational.abstract_factory.airplane;

import task03.voitenkov.creational.abstract_factory.transport_interface.Airplane;

/**
 * AirplaneFactory - singleton.
 * Method getAirplane - factory.
 * Нам известен интерфейс, но заранее не известно, какая реализация будет использоваться.
 * Создание объекта происходит через вызов метода в который передается условие(параметр).
 */
public class AirplaneFactory {

    public static AirplaneFactory instance;

    public static AirplaneFactory getInstance() {
        if (instance == null) {
            instance = new AirplaneFactory();
        }
        return instance;
    }

    private AirplaneFactory() {
    }

    public Airplane getAirplane(AirplaneModel airplaneModel) {
        Airplane airplane = null;
        switch (airplaneModel) {
            case BOEING737:
                airplane = new Boeing737();
                break;
            case AN22:
                airplane = new An22();
                break;
            default:
                System.out.println("Error: такой самолет отсутствует!");
                break;
        }
        return airplane;
    }
}