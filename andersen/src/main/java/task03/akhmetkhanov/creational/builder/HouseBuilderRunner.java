package task03.akhmetkhanov.creational.builder;

public class HouseBuilderRunner {
    public static void main(String[] args) {
        Builder simpleBuilder = new SimpleHouseBuilder();
        Builder luxuryBuilder = new LuxuryHouseBuilder();

        Director director = new Director(simpleBuilder);
        System.out.println(director.buildSimpleHouse());

        director.setBuilder(luxuryBuilder);
        System.out.println(director.buildLuxuryHouse());
    }
}
