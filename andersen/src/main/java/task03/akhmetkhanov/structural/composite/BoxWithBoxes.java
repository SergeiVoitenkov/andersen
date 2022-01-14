package task03.akhmetkhanov.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BoxWithBoxes implements Box {
    private List<Box> boxes;

    public BoxWithBoxes() {
        this.boxes = new ArrayList<>();
    }

    public void putBox(Box box) {
        boxes.add(box);
    }

    @Override
    public int getWeight() {
        int total = 0;
        for (Box box : boxes) {
            total += box.getWeight();
        }
        return total;
    }
}
