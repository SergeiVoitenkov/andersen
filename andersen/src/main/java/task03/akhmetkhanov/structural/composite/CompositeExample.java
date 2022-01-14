package task03.akhmetkhanov.structural.composite;

/**
 * Here we have a main box which can contain both items and boxes with items.
 * In this particular we have box with two instruments and with two boxes with fixings inside.
 * Each box might calculate it own weight.
 * As a result we'll see total main box weight in console.
 */
public class CompositeExample {
    public static void main(String[] args) {
        MainBox mainBox = new MainBox();
        mainBox.putItem(new Item("hammer", 1500));
        mainBox.putItem(new Item("screwdriver", 500));

        BoxWithBoxes fixings = new BoxWithBoxes();

        BoxWithItems nails = new BoxWithItems();
        for (int i = 0; i < 5; i++) nails.putItem(new Item("nail", 5));

        BoxWithItems screws = new BoxWithItems();
        for (int i = 0; i < 5; i++) screws.putItem(new Item("screw", 4));

        fixings.putBox(nails);
        fixings.putBox(screws);

        mainBox.putBox(fixings);

        System.out.println(mainBox.getWeight());
    }
}
