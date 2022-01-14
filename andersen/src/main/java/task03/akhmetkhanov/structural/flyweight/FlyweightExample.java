package task03.akhmetkhanov.structural.flyweight;

public class FlyweightExample {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle car1 = factory.createVehicle("black");
        car1.start();

        Vehicle car2 = factory.createVehicle("black");
        car2.start();
    }
}
