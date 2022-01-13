package task03.akhmetkhanov.creational.builder;

public interface Builder {
    House reset();
    Builder setFloors(int floors);
    Builder setMaterial(String material);
    Builder setGarden(boolean garden);
    Builder setSwimmingPool(boolean swimmingPool);
    Builder setGarage(boolean garage);
    House build();

}
