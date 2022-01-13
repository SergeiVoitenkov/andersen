package task03.akhmetkhanov.creational.singleton.onethread;

public class SomeUser {
    DatabaseConnection connection;

    public SomeUser(DatabaseConnection connection) {
        this.connection = connection;
    }

    public void workWithDB() {
        System.out.println("User is working with database using connection " + connection.getConnectionId());
    }
}
