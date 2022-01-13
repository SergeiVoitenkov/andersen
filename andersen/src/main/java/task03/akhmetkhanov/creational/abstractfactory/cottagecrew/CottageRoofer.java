package task03.akhmetkhanov.creational.abstractfactory.cottagecrew;

import task03.akhmetkhanov.creational.abstractfactory.Roofer;

public class CottageRoofer implements Roofer {
    @Override
    public void buildRoof() {
        System.out.println("Building a cottage roof in progress");
    }
}
