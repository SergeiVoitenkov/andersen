package task04.classes.voitenkov.inner_class;

public class Car {
    private String color;
    private int doorCount;
    private Engine engine;

    public Car(String color, int doorCount) {
        this.color = color;
        this.doorCount = doorCount;
    }

    public Car(String color, int doorCount, double volume) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(volume);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public class Engine {

        private double volume;

        public Engine(double volume) {
            this.volume = volume;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + volume +
                    '}';
        }

        public double getVolume() {
            return volume;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoorCount() {
        return doorCount;
    }

    public void setDoorCount(int doorCount) {
        this.doorCount = doorCount;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
