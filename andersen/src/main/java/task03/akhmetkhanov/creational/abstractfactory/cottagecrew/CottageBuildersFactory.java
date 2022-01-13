package task03.akhmetkhanov.creational.abstractfactory.cottagecrew;

import task03.akhmetkhanov.creational.abstractfactory.Builder;
import task03.akhmetkhanov.creational.abstractfactory.BuildingCrewFactory;
import task03.akhmetkhanov.creational.abstractfactory.Plasterer;
import task03.akhmetkhanov.creational.abstractfactory.Roofer;

public class CottageBuildersFactory implements BuildingCrewFactory {
    @Override
    public Builder getBuilder() {
        return new CottageBuilder();
    }

    @Override
    public Roofer getRoofer() {
        return new CottageRoofer();
    }

    @Override
    public Plasterer getPlasterer() {
        return new CottagePlasterer();
    }
}
