package task03.creational.pattern.abstract_factory.airplane;

import task03.creational.pattern.abstract_factory.transport_interface.Airplane;

public class An22 implements Airplane {
    @Override
    public void take_Off() {
        System.out.println("Самолет An22 взлетел.");
    }

    @Override
    public void to_Land() {
        System.out.println("Самолет An22 приземлился.");
    }
}