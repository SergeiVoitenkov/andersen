package task03.akhmetkhanov.creational.singleton.onethread;

public class DatabaseConnection {

    private static DatabaseConnection connection;
    private int connectionId;

    private DatabaseConnection(int connectionId) {
        this.connectionId = connectionId;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public static DatabaseConnection getConnection(int connectionId) {
        if (connection == null) {
            connection = new DatabaseConnection(connectionId);
        }
        System.out.printf("Connection %d to database is set\n", connectionId);

        return connection;
    }

}
