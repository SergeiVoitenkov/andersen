package task03.akhmetkhanov.structural.proxy;

public class HeavyObjectImpl implements HeavyObject {

    public HeavyObjectImpl() {
        longInitialization();
    }

    private void longInitialization() {
        System.out.println("Starting initialization...");
        for (int i = 1; i <= 100; i++) {
            if (i % 10 == 0) System.out.println(i + "%...");
        }
    }

    @Override
    public void process() {
        System.out.println("Ready for use!");
    }
}
