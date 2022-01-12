package task03.voitenkov.creational.builder;

import task03.voitenkov.creational.builder.car.Car;
import task03.voitenkov.creational.builder.car.Director;
import task03.voitenkov.creational.builder.car.category.PremiumCar;

public class BuildCarRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PremiumCar());

        Car car = director.builderCar();

        System.out.println(car);
    }
}