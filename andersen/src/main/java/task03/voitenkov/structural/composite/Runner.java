package task03.voitenkov.structural.composite;

public class Runner {
    public static void main(String[] args) {
        try {
            Employee director = new Employee("Serge", "Director", 1000);
            Employee leadManager = new Employee("Kate", "Manager", 1000);
            Employee sportsManager = new Employee("Max", "Sports Manager", 300);
            Employee sedanManager = new Employee("Alex", "Sedan Manager", 300);
            Employee luxuryManager = new Employee("Mister", "Luxury Manager", 700);
            Employee engineer1 = new Employee("Sasha", "car Engineer", 650);
            Employee engineer2 = new Employee("Lisa", "car engineer", 650);
            Employee worker1 = new Employee("Ivan", "worker", 450);
            Employee worker2 = new Employee("Svetlana", "worker", 450);

            director.add(leadManager);

            leadManager.add(sportsManager);
            leadManager.add(sedanManager);
            leadManager.add(luxuryManager);

            sportsManager.add(engineer1);
            sedanManager.add(engineer2);

            engineer1.add(worker1);
            engineer2.add(worker2);

            sportsManager.showSubordinatesDetails();
        } catch (Exception e) {
            System.out.println("whatSup");
        }
    }
}
