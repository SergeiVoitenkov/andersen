package task03.voitenkov.structural.adapter;

public class Runner {
    public static void main(String[] args) {
        Car car = new AdapterCar();
        car.getCar();
    }
}
