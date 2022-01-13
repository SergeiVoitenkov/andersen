package task03.akhmetkhanov.creational.singleton.onethread;

public class SingletonExample {
    public static void main(String[] args) {
        DatabaseConnection connection1 = DatabaseConnection.getConnection(1);
        SomeUser user1 = new SomeUser(connection1);
        user1.workWithDB();

        DatabaseConnection connection2 = DatabaseConnection.getConnection(2);
        SomeUser user2 = new SomeUser(connection2);
        user2.workWithDB();
    }
}
