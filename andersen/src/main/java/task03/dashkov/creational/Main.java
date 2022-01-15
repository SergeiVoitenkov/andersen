package task03.dashkov.creational;

import task03.dashkov.creational.abstractFactoryBuilderPrototype.*;

public class Main {
    public static void main(String[] args) {
        //Singleton singleton = Singleton.getInstance();
        Car car = new Car();
        Production volvo = car.getCarBrand(CarBrand.Volvo);
        Transmission rearDrive = car.getCarTransmission(CarTransmission.RearDrive);

        car = new Car.Builder().withName("M1")
                .withYearOfProduction(2006)
                .withPrice(200_000)
                .withProduction(volvo)
                .withTransmissionType(rearDrive)
                .build();

        System.out.println(car);
        Car car2 = (Car) car.clone();
        car2.setName("m3");
        System.out.println("clone");
        System.out.println(car2);
    }
}