package task03.akhmetkhanov.creational.singleton.multithreading;

public class SingletonExample {
    public static void main(String[] args) {
        Thread userThread1 = new Thread(() -> {
            DatabaseConnection connection1 = DatabaseConnection.getConnection(1);
            SomeUser user1 = new SomeUser(connection1);
            user1.workWithDB();
        });

        Thread userThread2 = new Thread(() -> {
            DatabaseConnection connection2 = DatabaseConnection.getConnection(2);
            SomeUser user2 = new SomeUser(connection2);
            user2.workWithDB();
        });

        userThread1.start();
        userThread2.start();
    }
}
