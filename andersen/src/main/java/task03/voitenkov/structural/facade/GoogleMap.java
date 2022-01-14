package task03.voitenkov.structural.facade;

public class GoogleMap implements CarSystemPlan {
    public void turnOn() {
        System.out.println("Google map started");
    }

    public void turnOff() {
        System.out.println("Google map is turned off");
    }
}