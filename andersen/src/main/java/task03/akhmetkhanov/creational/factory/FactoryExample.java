package task03.akhmetkhanov.creational.factory;

import task03.akhmetkhanov.creational.factory.delivery.Delivery;
import task03.akhmetkhanov.creational.factory.delivery.ShipDelivery;
import task03.akhmetkhanov.creational.factory.delivery.TruckDelivery;

public class FactoryExample {
    public static void main(String[] args) {
        Delivery truckDelivery = new TruckDelivery();
        truckDelivery.executeDelivery();

        Delivery shipDelivery = new ShipDelivery();
        shipDelivery.executeDelivery();
    }
}
