package task03.akhmetkhanov.structural.decorator;

public class SeniorDeveloper {
    private MiddleDeveloper middleDeveloper;

    public SeniorDeveloper(MiddleDeveloper middleDeveloper) {
        this.middleDeveloper = middleDeveloper;
    }

    public void work() {
        middleDeveloper.work();
        System.out.println("And in general, I'm almost a god.");
    }
}
