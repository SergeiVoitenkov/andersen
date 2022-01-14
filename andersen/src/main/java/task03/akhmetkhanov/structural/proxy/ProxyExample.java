package task03.akhmetkhanov.structural.proxy;

public class ProxyExample {
    public static void main(String[] args) {
        HeavyObject proxyObject = new HeavyObjectProxy();
        proxyObject.process();
        System.out.println("\n====================\n");
        proxyObject.process();
    }
}
