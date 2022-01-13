package task03.akhmetkhanov.creational.abstractfactory.plantcrew;

import task03.akhmetkhanov.creational.abstractfactory.Builder;
import task03.akhmetkhanov.creational.abstractfactory.BuildingCrewFactory;
import task03.akhmetkhanov.creational.abstractfactory.Plasterer;
import task03.akhmetkhanov.creational.abstractfactory.Roofer;

public class PlantBuildersFactory implements BuildingCrewFactory {
    @Override
    public Builder getBuilder() {
        return new PlantBuilder();
    }

    @Override
    public Roofer getRoofer() {
        return new PlantRoofer();
    }

    @Override
    public Plasterer getPlasterer() {
        return new PlantPlasterer();
    }
}
