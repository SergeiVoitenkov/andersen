package task03.akhmetkhanov.structural.facade;

/**
 * Here we use Computer class as a facade to run computer.
 * User doesn't have to manually run each process to run the computer - he just pushes the ON button to start it.
 */
public class FacadeExample {
    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.start();
    }
}
