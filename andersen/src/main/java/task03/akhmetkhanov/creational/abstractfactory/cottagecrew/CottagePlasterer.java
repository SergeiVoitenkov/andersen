package task03.akhmetkhanov.creational.abstractfactory.cottagecrew;

import task03.akhmetkhanov.creational.abstractfactory.Plasterer;

public class CottagePlasterer implements Plasterer {
    @Override
    public void plasterWalls() {
        System.out.println("Plastering cottage walls in progress");
    }
}
