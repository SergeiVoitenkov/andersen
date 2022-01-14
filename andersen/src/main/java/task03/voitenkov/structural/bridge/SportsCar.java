package task03.voitenkov.structural.bridge;

public class SportsCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public SportsCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}