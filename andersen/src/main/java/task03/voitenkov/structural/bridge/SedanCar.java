package task03.voitenkov.structural.bridge;

public class SedanCar implements CarPlan {
    ColorFinishPlan colorFinishPlan;

    public SedanCar(ColorFinishPlan colorFinishPlan) {
        this.colorFinishPlan = colorFinishPlan;
    }

    public void paintCar() {
        colorFinishPlan.paint();
    }
}
