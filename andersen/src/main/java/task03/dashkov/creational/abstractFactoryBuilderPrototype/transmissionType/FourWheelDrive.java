package task03.dashkov.creational.abstractFactoryBuilderPrototype.transmissionType;

import task03.dashkov.creational.abstractFactoryBuilderPrototype.Transmission;

public class FourWheelDrive implements Transmission {
    @Override
    public void getTransmission() {
        System.out.println("Transmission type: Four Wheel Drive");
    }
}
