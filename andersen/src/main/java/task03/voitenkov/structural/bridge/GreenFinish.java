package task03.voitenkov.structural.bridge;

public class GreenFinish implements ColorFinishPlan {
    public void paint() {
        chooseColor();
        startPaintMachine();
        System.out.println("Car Painted Successfully");
    }

    public void chooseColor() {
        System.out.println("Green Color Chosen Successfully");
    }

    public void startPaintMachine() {
        System.out.println("Paint Machine Started");
    }
}
