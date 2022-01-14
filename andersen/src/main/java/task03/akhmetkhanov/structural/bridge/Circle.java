package task03.akhmetkhanov.structural.bridge;

public class Circle extends Figure {

    public Circle(Colour colour) {
        super(colour);
        System.out.println("Circle is drawn.");
    }

    @Override
    public void applyColour() {
        System.out.println("Painting out the figure...");
        colour.applyColour();
    }
}
