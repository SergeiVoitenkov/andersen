package task03.dashkov.creational.abstractFactoryBuilderPrototype.transmissionType;

import task03.dashkov.creational.abstractFactoryBuilderPrototype.Transmission;

public class RearDrive implements Transmission {
    @Override
    public void getTransmission() {
        System.out.println("Transmission type: Rear Drive");
    }
}
