package task03.voitenkov.structural.adapter;

public class AmericanCar {

    private final String nameCar = "Dodge";

    public String getNameCar() {
        return nameCar;
    }

    @Override
    public String toString() {
        return "AmericanCar{" +
                "nameCar='" + nameCar + '\'' +
                '}';
    }
}
