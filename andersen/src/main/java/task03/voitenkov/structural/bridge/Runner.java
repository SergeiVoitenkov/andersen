package task03.voitenkov.structural.bridge;

public class Runner {
    public static void main(String[] args) {
        try {
            CarPlan sportsCar = new SportsCar(new RedFinish());
            sportsCar.paintCar();
            CarPlan luxuryCar = new LuxuryCar(new GreenFinish());
            luxuryCar.paintCar();
        } catch (Exception e) {
            System.out.println("whatSup");
        }
    }
}
