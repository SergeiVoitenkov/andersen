package task03.akhmetkhanov.creational.factory.transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by ship has been executed");
    }
}
