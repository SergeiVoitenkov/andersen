package task03.akhmetkhanov.creational.factory.transport;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by truck has been executed");
    }
}
