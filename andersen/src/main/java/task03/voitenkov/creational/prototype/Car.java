package task03.voitenkov.creational.prototype;

public class Car implements Copyable{
    private int id;
    private String name;
    private String model;
    private double maxSpeed;

    public Car(int id, String name, String model, double maxSpeed) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public Object copy() {
        Car copy = new Car(id, name, model, maxSpeed);
        return copy;
    }
}
