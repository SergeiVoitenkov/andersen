package task03.voitenkov.structural.decorator;

public class Runner {
    public static void main(String[] args) {
        try {
            SystemPlan systemPlan = new NitroBoost(new SecuritySystem(new AutoPilot(new CarSystem())));
            System.out.println("Total cost of the system is " + systemPlan.getSystemCost());
            systemPlan.getSystemDetails();
            SystemPlan systemPlanB = new NitroBoost(new SecuritySystem(new AutoPilot(new BikeSystem())));
            System.out.println("Total cost of the system is " + systemPlanB.getSystemCost());
            systemPlanB.getSystemDetails();
        } catch (Exception e) {
            System.out.println("whatSup");
        }
    }
}
