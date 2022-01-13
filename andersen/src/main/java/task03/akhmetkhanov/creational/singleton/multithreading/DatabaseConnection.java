package task03.akhmetkhanov.creational.singleton.multithreading;

public class DatabaseConnection {

    private static volatile DatabaseConnection connection;
    private int connectionId;

    private DatabaseConnection(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public static DatabaseConnection getConnection(int connectionId) {
        synchronized (DatabaseConnection.class) {
            if (connection == null) {
                connection = new DatabaseConnection(connectionId);
            }
        }
        System.out.printf("Connection %d to database is set\n", connectionId);

        return connection;
    }

}
