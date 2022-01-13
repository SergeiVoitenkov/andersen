package task03.akhmetkhanov.creational.abstractfactory.cottagecrew;

import task03.akhmetkhanov.creational.abstractfactory.Builder;

public class CottageBuilder implements Builder {
    @Override
    public void buildWalls() {
        System.out.println("Building cottage walls in progress");
    }
}
