package task03.akhmetkhanov.creational.builder;

public class SimpleHouseBuilder implements Builder {
    private House house = new House();

    public House reset() {
        house = new House();
        return house;
    }

    @Override
    public SimpleHouseBuilder setFloors(int floors) {
        house.setFloors(floors);
        return this;
    }

    @Override
    public SimpleHouseBuilder setMaterial(String material) {
        house.setMaterial(material);
        return this;
    }

    @Override
    public SimpleHouseBuilder setGarden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    @Override
    public SimpleHouseBuilder setSwimmingPool(boolean swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public SimpleHouseBuilder setGarage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    public House build() {
        return house;
    }
}
