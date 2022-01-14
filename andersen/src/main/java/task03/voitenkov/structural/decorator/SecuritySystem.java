package task03.voitenkov.structural.decorator;

class SecuritySystem extends SystemDecorator {

    SecuritySystem(SystemPlan systemPlan) {
        super(systemPlan);
    }

    public int getSystemCost() {
        return 25 + systemPlan.getSystemCost();
    }

    public void getSystemDetails() {
        this.systemPlan.getSystemDetails();
        System.out.println("Security System");
    }
}