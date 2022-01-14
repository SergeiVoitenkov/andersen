package task03.akhmetkhanov.structural.decorator;

public class MiddleDeveloper {
    private JuniorDeveloper juniorDeveloper;

    public MiddleDeveloper(JuniorDeveloper juniorDeveloper) {
        this.juniorDeveloper = juniorDeveloper;
    }

    public void work() {
        juniorDeveloper.work();
        System.out.println("And I can write advanced code and mentor junior developers.");
    }
}
