package task03.akhmetkhanov.creational.abstractfactory.plantcrew;

import task03.akhmetkhanov.creational.abstractfactory.Builder;

public class PlantBuilder implements Builder {
    @Override
    public void buildWalls() {
        System.out.println("Building facility walls in progress");
    }
}
