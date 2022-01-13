package task03.akhmetkhanov.creational.builder;

public class LuxuryHouseBuilder implements Builder {
    private House house = new House();

    @Override
    public House reset() {
        house = new House();
        return house;
    }

    @Override
    public Builder setFloors(int floors) {
        house.setFloors(floors);
        return this;
    }

    @Override
    public Builder setMaterial(String material) {
        house.setMaterial(material);
        return this;
    }

    @Override
    public Builder setGarden(boolean garden) {
        house.setGarden(garden);
        return this;
    }

    @Override
    public Builder setSwimmingPool(boolean swimmingPool) {
        house.setSwimmingPool(swimmingPool);
        return this;
    }

    @Override
    public Builder setGarage(boolean garage) {
        house.setGarage(garage);
        return this;
    }

    @Override
    public House build() {
        return house;
    }
}
