package task03.akhmetkhanov.creational.factory.delivery;

import task03.akhmetkhanov.creational.factory.transport.Ship;
import task03.akhmetkhanov.creational.factory.transport.Transport;

public class ShipDelivery extends Delivery {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
