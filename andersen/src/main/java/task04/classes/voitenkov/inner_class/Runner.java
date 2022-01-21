package task04.classes.voitenkov.inner_class;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("Orange", 4, 1.6);

        Car car1 = new Car("Blue", 5);
        Car.Engine engine = car1.new Engine(2.0);
        car1.setEngine(engine);
        Car.Engine engine2 = new Car("Red", 3).new Engine(3.0);
        System.out.println(car);

        System.out.println(engine);
        System.out.println(car1);
        System.out.println(engine2);
    }
}
