package task03.creational.pattern.builder;

import task03.creational.pattern.builder.car.Car;
import task03.creational.pattern.builder.car.Director;
import task03.creational.pattern.builder.car.category.PremiumCar;

public class BuildCarRunner {

    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new PremiumCar());

        Car car = director.builderCar();

        System.out.println(car);
    }
}