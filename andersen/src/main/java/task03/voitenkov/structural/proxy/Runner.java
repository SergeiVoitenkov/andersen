package task03.voitenkov.structural.proxy;


class Runner {
    public static void main(String[] args) {
        try {
            Driver driver = new Driver(26, "shubham");
            CarProxy carProxy = new CarProxy();
            carProxy.setDriver(driver);
            carProxy.driveCar();
        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
}
