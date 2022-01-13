package task03.akhmetkhanov.creational.factory.delivery;

import task03.akhmetkhanov.creational.factory.transport.Transport;
import task03.akhmetkhanov.creational.factory.transport.Truck;

public class TruckDelivery extends Delivery {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
