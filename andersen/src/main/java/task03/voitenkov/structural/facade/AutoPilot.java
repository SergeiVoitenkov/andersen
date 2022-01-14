package task03.voitenkov.structural.facade;

public class AutoPilot {
    CarSystemPlan map;
    CarSystemPlan engine;
    CarSystemPlan ai;
    CarSystemPlan guidingVoice;

    AutoPilot() {
        map = new GoogleMap();
        engine = new Engine();
        ai = new ArtificialIntelligence();
        guidingVoice = new GuidingVoice();
    }

    public void start() {
        map.turnOn();
        engine.turnOn();
        ai.turnOn();
        guidingVoice.turnOn();
        System.out.println("You can relax now. The car is in autopilot mode");
    }

    public void end() {
        map.turnOff();
        engine.turnOff();
        ai.turnOff();
        guidingVoice.turnOff();
    }
}
