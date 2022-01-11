package task03.creational.pattern.abstract_factory.factory;

import task03.creational.pattern.abstract_factory.airplane.AirplaneFactory;
import task03.creational.pattern.abstract_factory.airplane.AirplaneModel;
import task03.creational.pattern.abstract_factory.car.CarFactory;
import task03.creational.pattern.abstract_factory.car.CarModel;
import task03.creational.pattern.abstract_factory.transport_interface.Airplane;
import task03.creational.pattern.abstract_factory.transport_interface.Car;
import task03.creational.pattern.abstract_factory.transport_factory.TransportFactory;

public class USAFactory implements TransportFactory {

    @Override
    public Car createCar(CarModel carModel) {
        return CarFactory.getInstance().getCar(carModel);
    }

    @Override
    public Airplane createAirplane(AirplaneModel airplaneModel) {
        return AirplaneFactory.getInstance().getAirplane(airplaneModel);
    }
}