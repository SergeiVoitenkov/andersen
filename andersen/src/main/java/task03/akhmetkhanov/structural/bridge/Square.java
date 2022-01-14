package task03.akhmetkhanov.structural.bridge;

public class Square extends Figure {

    public Square(Colour colour) {
        super(colour);
        System.out.println("Square is drawn");
    }

    @Override
    public void applyColour() {
        System.out.println("Painting out the figure...");
        colour.applyColour();
    }
}
