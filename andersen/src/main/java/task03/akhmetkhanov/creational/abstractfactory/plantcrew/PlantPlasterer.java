package task03.akhmetkhanov.creational.abstractfactory.plantcrew;

import task03.akhmetkhanov.creational.abstractfactory.Plasterer;

public class PlantPlasterer implements Plasterer {
    @Override
    public void plasterWalls() {
        System.out.println("Plastering plant walls in progress");
    }
}
