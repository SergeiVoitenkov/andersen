package task03.voitenkov.creational.builder.car;

/**
 * Паттерн строитель позволяет отделить построение сложного объекта от его представления,
 * создавая сложные объекты, используя простые объекты и поэтапный подход.
 */
public abstract class CarBuilder {
    public Car car;

    public void createCar() {
        car = new Car();
    }

    public abstract void buildName();
    public abstract void buildPrice();

    public Car getCar() {
        return car;
    }
}