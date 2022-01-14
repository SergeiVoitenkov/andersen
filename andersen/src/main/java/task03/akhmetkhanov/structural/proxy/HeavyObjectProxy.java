package task03.akhmetkhanov.structural.proxy;

public class HeavyObjectProxy implements HeavyObject {
    private HeavyObject heavyObject;

    @Override
    public void process() {
        if (heavyObject == null) heavyObject = new HeavyObjectImpl();
        heavyObject.process();
    }
}
