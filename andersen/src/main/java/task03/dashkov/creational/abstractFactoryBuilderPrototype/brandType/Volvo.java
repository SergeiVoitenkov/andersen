package task03.dashkov.creational.abstractFactoryBuilderPrototype.brandType;

import task03.dashkov.creational.abstractFactoryBuilderPrototype.Production;

public class Volvo implements Production {
    @Override
    public void getBrand() {
        System.out.println("Car type: Volvo");
    }
}
