package task03.akhmetkhanov.structural.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        JuniorDeveloper juniorDeveloper = new JuniorDeveloper();
        juniorDeveloper.work();
        System.out.println("=========================");

        MiddleDeveloper middleDeveloper = new MiddleDeveloper(new JuniorDeveloper());
        middleDeveloper.work();
        System.out.println("=========================");

        SeniorDeveloper seniorDeveloper = new SeniorDeveloper(new MiddleDeveloper(new JuniorDeveloper()));
        seniorDeveloper.work();
    }
}
