package task03.dashkov.structural.adapter;

public class Sparrow implements Bird{
    @Override
    public void fly() {
        System.out.println("Yup, i can fly");
    }

    @Override
    public void sound() {
        System.out.println("chip, chip");
    }
}
