package task03.akhmetkhanov.structural.bridge;

public abstract class Figure {
    protected Colour colour;

    public Figure(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    abstract public void applyColour();
}
