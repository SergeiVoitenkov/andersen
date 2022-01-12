package task03.voitenkov.creational.builder.car;

public class Car {
    private CarModel carModel;
    private double price;

    public void setName(CarModel carModel) {
        this.carModel = carModel;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carModel=" + carModel +
                ", price=" + price +
                '}';
    }
}