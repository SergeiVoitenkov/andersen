package task03.dashkov.structural.adapter;

public class BirdAdapter  implements ToyBird{

    Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void makeSound() {
        bird.sound();
    }
}
