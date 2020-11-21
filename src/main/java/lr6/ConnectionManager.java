package lr6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

    static final String DB_URL = "jdbc:postgresql://localhost:5432/lr6";
    static final String USER = "postgres";
    static final String PASSWORD = "postgres";
    private Connection conn = null;

    public void connect() {
        try {
            this.conn = DriverManager.getConnection(DB_URL, USER, PASSWORD);
            System.out.println("Подключение к БД.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public Connection getConnection() {
        return this.conn;
    }

    public void closeConnection() {
        try {
            this.conn.close();
            System.out.println("БД отключена.");
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
