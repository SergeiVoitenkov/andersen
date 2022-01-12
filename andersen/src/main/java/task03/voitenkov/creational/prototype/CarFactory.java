package task03.voitenkov.creational.prototype;

public class CarFactory {
    private Car car;

    public CarFactory(Car car) {
        this.car = car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Car cloneCar() {
        return (Car) car.copy();
    }
}