package task03.akhmetkhanov.creational.abstractfactory.plantcrew;

import task03.akhmetkhanov.creational.abstractfactory.Roofer;

public class PlantRoofer implements Roofer {
    @Override
    public void buildRoof() {
        System.out.println("Building a plant roof in progress");
    }
}
