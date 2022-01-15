package task03.dashkov.structural;

import task03.dashkov.structural.adapter.*;

public class Main {
    public static void main(String[] args) {
        Parrot parrot = new Parrot();
        ToyBird toy = new ToyParrot();
        ToyBird adapter = new BirdAdapter(parrot);
        parrot.fly();
        parrot.sound();
        toy.makeSound();
        adapter.makeSound();
    }
}
