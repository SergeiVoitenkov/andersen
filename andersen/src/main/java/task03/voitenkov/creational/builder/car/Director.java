package task03.voitenkov.creational.builder.car;

public class Director {
    private CarBuilder carBuilder;

    public void setBuilder(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car builderCar() {
        carBuilder.createCar();
        carBuilder.buildName();
        carBuilder.buildPrice();

        return carBuilder.getCar();
    }
}