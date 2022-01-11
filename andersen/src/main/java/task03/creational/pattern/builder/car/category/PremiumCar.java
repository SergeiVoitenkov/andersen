package task03.creational.pattern.builder.car.category;

import task03.creational.pattern.builder.car.CarBuilder;
import task03.creational.pattern.builder.car.CarModel;

public class PremiumCar extends CarBuilder {
    @Override
    public void buildName() {
        car.setName(CarModel.PORSCHE);
    }

    @Override
    public void buildPrice() {
        car.setPrice(130000);
    }
}