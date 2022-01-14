package task03.voitenkov.structural.facade;

public class Runner {

    public static void main(String[] args) {
        try {
            AutoPilot ap = new AutoPilot();
            ap.start();
        } catch (Exception e) {
            System.out.println("whatSup");
        }
    }

}
