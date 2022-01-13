package task03.akhmetkhanov.creational.abstractfactory;

public interface BuildingCrewFactory {
    Builder getBuilder();
    Roofer getRoofer();
    Plasterer getPlasterer();
}
