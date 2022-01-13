package task03.akhmetkhanov.creational.factory.delivery;

import task03.akhmetkhanov.creational.factory.transport.Transport;

public abstract class Delivery {

    public void executeDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }

    public abstract Transport createTransport();
}
