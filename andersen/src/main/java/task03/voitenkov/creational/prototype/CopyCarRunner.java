package task03.voitenkov.creational.prototype;

public class CopyCarRunner {

    public static void main(String[] args) {
        Car car = new Car(1, "BMW", "525", 220);
        System.out.println(car);

        CarFactory factory = new CarFactory(car);
        Car cloneCar = factory.cloneCar();
        System.out.println(cloneCar);
    }
}