package task03.akhmetkhanov.creational.abstractfactory;

import task03.akhmetkhanov.creational.abstractfactory.plantcrew.PlantBuildersFactory;

public class BuildPlantRunner {
    public static void main(String[] args) {
        System.out.println("Starting plant construction");

        BuildingCrewFactory plantBuilders = new PlantBuildersFactory();
        plantBuilders.getBuilder().buildWalls();
        plantBuilders.getRoofer().buildRoof();
        plantBuilders.getPlasterer().plasterWalls();
    }
}
