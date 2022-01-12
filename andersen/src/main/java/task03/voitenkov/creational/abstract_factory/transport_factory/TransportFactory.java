package task03.voitenkov.creational.abstract_factory.transport_factory;

import task03.voitenkov.creational.abstract_factory.airplane.AirplaneModel;
import task03.voitenkov.creational.abstract_factory.car.CarModel;
import task03.voitenkov.creational.abstract_factory.transport_interface.Airplane;
import task03.voitenkov.creational.abstract_factory.transport_interface.Car;

/**
 * Абстрактная фабрика - это семейство объектов разных типов, где возвращаются экземпляры разных типов.
 * Объекты внутри фабрики связаны по смыслу или по задаче.
 */
public interface TransportFactory {
    Car createCar(CarModel carModel);

    Airplane createAirplane(AirplaneModel airplaneModel);
}