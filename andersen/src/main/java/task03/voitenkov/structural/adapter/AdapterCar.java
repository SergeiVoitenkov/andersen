package task03.voitenkov.structural.adapter;

public class AdapterCar extends AmericanCar implements Car {

    @Override
    public void getCar() {
        System.out.println("Американский автомобиль: " + getNameCar());
    }
}
