package task03.akhmetkhanov.structural.flyweight;

public class Car implements Vehicle {
    private Engine engine;
    private String colour;

    public Car(Engine engine, String colour) {
        this.engine = engine;
        this.colour = colour;
        /**
         * New car construction takes a while...
         */
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start() {
        engine.start();
    }

    @Override
    public void stop() {
        engine.stop();
    }

}
