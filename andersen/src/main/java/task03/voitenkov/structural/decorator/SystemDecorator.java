package task03.voitenkov.structural.decorator;

abstract class SystemDecorator implements SystemPlan {
    SystemPlan systemPlan;

    SystemDecorator(SystemPlan systemPlan) {
        this.systemPlan = systemPlan;
    }

    public int getSystemCost() {
        return systemPlan.getSystemCost();
    }

    public void getSystemDetails() {
        systemPlan.getSystemDetails();
    }
}
