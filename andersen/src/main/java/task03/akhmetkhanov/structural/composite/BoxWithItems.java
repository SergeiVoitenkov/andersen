package task03.akhmetkhanov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BoxWithItems implements Box {
    private List<Item> items;

    public BoxWithItems() {
        this.items = new ArrayList<>();
    }

    public void putItem(Item item) {
        items.add(item);
    }

    @Override
    public int getWeight() {
        int total = 0;
        for (Item item : items) {
            total += item.getWeight();
        }
        return total;
    }
}
