package task03.akhmetkhanov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class MainBox implements Box {
    private List<Box> boxes;
    private List<Item> items;

    public MainBox() {
        this.boxes = new ArrayList<>();
        this.items = new ArrayList<>();
    }

    public void putBox(Box box) {
        boxes.add(box);
    }

    public void putItem(Item item) {
        items.add(item);
    }

    @Override
    public int getWeight() {
        int total = 0;
        for (Box box : boxes) {
            total += box.getWeight();
        }

        for (Item item : items) {
            total += item.getWeight();
        }

        return total;
    }
}
