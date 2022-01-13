package task03.akhmetkhanov.creational.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public House buildSimpleHouse() {
        return builder.setFloors(1)
                .setMaterial("wood")
                .setGarden(false)
                .setSwimmingPool(false)
                .setGarage(true)
                .build();
    }

    public House buildLuxuryHouse() {
        return builder.setFloors(3)
                .setMaterial("stone")
                .setGarden(true)
                .setSwimmingPool(true)
                .setGarage(true)
                .build();
    }
}
