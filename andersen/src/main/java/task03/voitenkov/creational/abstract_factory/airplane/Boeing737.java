package task03.voitenkov.creational.abstract_factory.airplane;

import task03.voitenkov.creational.abstract_factory.transport_interface.Airplane;

public class Boeing737 implements Airplane {
    @Override
    public void take_Off() {
        System.out.println("Самолет Boeing737 взлетел.");
    }

    @Override
    public void to_Land() {
        System.out.println("Самолет Boeing737 приземлился.");
    }
}