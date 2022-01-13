package task03.akhmetkhanov.creational.builder;

public class House {
    private int floors;
    private String material;
    private boolean garden;
    private boolean swimmingPool;
    private boolean garage;

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public void setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    @Override
    public String toString() {
        return "House{" +
                "floors=" + floors +
                ", material='" + material + '\'' +
                ((!garden) ? "" : ", garden=" + garden) +
                ((!swimmingPool) ? "" : ", swimming pool=" + swimmingPool) +
                ((!garage) ? "" : ", garage=" + garage) +
                '}';
    }
}
