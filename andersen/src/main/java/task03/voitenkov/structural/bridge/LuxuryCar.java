package task03.voitenkov.structural.bridge;

public class LuxuryCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public LuxuryCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}
