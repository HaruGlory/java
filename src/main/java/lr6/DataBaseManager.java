package lr6;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class DataBaseManager {

    private final ConnectionManager database = new ConnectionManager();

    public DataBaseManager() {
        System.out.println("Подключение к БД.");
        database.connect();
    }

    public void exit() {
        System.out.println("Отключение от БД и выход.");
        database.closeConnection();
    }

    public void create(String name, String surname, String patronymic, String birthday) {
        String sql = "INSERT INTO students (name, surname, patronymic, birthday) VALUES (?, ?, ?, ?)";
        try {
            executeInsertQuery(sql, name, surname, patronymic, birthday);
            System.out.println("Информация о новом студенте добавлена.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void searchByBirthday(String birthday) {
        String sql = "SELECT * FROM students WHERE birthday = ?";
        try {
            executeSelectQuery(sql, birthday);
            System.out.println("Поиск выполнен успешно.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clearTable() {
        String sql = "DELETE FROM students";
        try {
            PreparedStatement query = database.getConnection().prepareStatement(sql);
            query.executeUpdate();
            query.close();
            System.out.println("БД очищена.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private void executeInsertQuery(String sql, String name, String surname, String patronymic,
                                    String birthday) throws SQLException {
        PreparedStatement query = database.getConnection().prepareStatement(sql);
        query.setString(1, name);
        query.setString(2, surname);
        query.setString(3, patronymic);
        query.setString(4, birthday);
        query.executeUpdate();
        query.close();
    }

    private void executeSelectQuery(String sql, String birthday) throws SQLException {
        PreparedStatement query = database.getConnection().prepareStatement(sql);
        query.setString(1, birthday);
        printQueryResults(query.executeQuery());
        query.close();
    }

    private void printQueryResults(ResultSet result) throws SQLException {
        ResultSetMetaData meta = result.getMetaData();
        int i = 1;
        while (result.next()) {
            System.out.print("Строка " + i++ + ": ");
            for (int j = 1; j < meta.getColumnCount() + 1; j++) {
                System.out.print(meta.getColumnLabel(j) + ": " + result.getObject(j) + ", ");
            }
            System.out.println();
        }
    }
}
