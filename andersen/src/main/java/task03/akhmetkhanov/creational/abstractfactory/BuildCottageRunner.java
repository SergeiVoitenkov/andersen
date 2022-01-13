package task03.akhmetkhanov.creational.abstractfactory;

import task03.akhmetkhanov.creational.abstractfactory.cottagecrew.CottageBuildersFactory;

public class BuildCottageRunner {
    public static void main(String[] args) {

        System.out.println("Starting cottage constructing:");
        BuildingCrewFactory cottageBuilders = new CottageBuildersFactory();
        cottageBuilders.getBuilder().buildWalls();
        cottageBuilders.getRoofer().buildRoof();
        cottageBuilders.getPlasterer().plasterWalls();
    }
}
