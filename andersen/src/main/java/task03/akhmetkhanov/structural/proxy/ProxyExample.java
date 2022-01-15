package task03.akhmetkhanov.structural.proxy;

/**
 * Assume we have some kind of heavy java object that needs some time for initial configuration.
 * We want that object to be initialized only once on demand, and once it is, we want to reuse it for every call.
 */
public class ProxyExample {
    public static void main(String[] args) {
        HeavyObject proxyObject = new HeavyObjectProxy();
        proxyObject.process();
        System.out.println("\n====================\n");
        proxyObject.process();
    }
}
