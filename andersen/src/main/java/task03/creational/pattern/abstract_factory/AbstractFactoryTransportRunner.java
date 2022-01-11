package task03.creational.pattern.abstract_factory;

import task03.creational.pattern.abstract_factory.transport_interface.Airplane;
import task03.creational.pattern.abstract_factory.transport_interface.Car;
import task03.creational.pattern.abstract_factory.airplane.AirplaneModel;
import task03.creational.pattern.abstract_factory.car.CarModel;
import task03.creational.pattern.abstract_factory.factory.ChinaFactory;
import task03.creational.pattern.abstract_factory.factory.USAFactory;
import task03.creational.pattern.abstract_factory.transport_factory.TransportFactory;

public class AbstractFactoryTransportRunner {

    public static void main(String[] args) {
        TransportFactory usaTransport = new USAFactory();
        TransportFactory chinaTransport = new ChinaFactory();

        Airplane airplane = usaTransport.createAirplane(AirplaneModel.BOEING737);
        airplane.take_Off();
        Car car = chinaTransport.createCar(CarModel.MERCEDES);
        car.drive();
    }
}
