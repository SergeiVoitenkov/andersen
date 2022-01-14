package task03.voitenkov.structural.decorator;

class AutoPilot extends SystemDecorator {
    AutoPilot(SystemPlan systemPlan) {
        super(systemPlan);
    }

    public int getSystemCost() {
        return 75 + systemPlan.getSystemCost();
    }

    public void getSystemDetails() {
        systemPlan.getSystemDetails();
        System.out.println("Auto Pilot System");
    }
}