package task03.voitenkov.structural.proxy;

public class CarProxy implements CarPlan {
    Driver driver;
    Car car;

    CarProxy() {
        this.car = new Car();
    }

    public void driveCar() {
        if (driver == null) {
            System.out.println("Error : Car needs a driver");
        } else if (driver.getAge() < 18) {
            System.out.println("Error : Drivers age must be graeter than 18");
        } else {
            car.driveCar();
        }
    }

    public void setDriver(Driver d) {
        driver = d;
    }
}