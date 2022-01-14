package task03.akhmetkhanov.structural.bridge;

public class BridgeExample {
    public static void main(String[] args) {

        Figure circle = new Circle(new BlackColour());
        circle.applyColour();

        System.out.println("\n========================\n");

        Figure square = new Square(new WhiteColour());
        square.applyColour();
    }
}
