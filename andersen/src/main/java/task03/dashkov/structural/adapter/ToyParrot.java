package task03.dashkov.structural.adapter;

public class ToyParrot implements ToyBird{
    @Override
    public void makeSound() {
        System.out.println("toy parrot sound");
    }
}
