package lr6;

import org.junit.jupiter.api.Test;

public class DataTest {

    @Test
    public void insertCheck() {
        DataBaseManager manager = new DataBaseManager();
        try {
            manager.create("Андрей", "Андреев", "Олегович", "1999-12-01");
            manager.create("Саша", "Васильев", "Антонович", "2000-05-28");
            manager.create("Сергей", "Матвиенко", "Фёдорович", "1995-09-03");
            manager.create("Алина", "Пупкина", "Владимировна", "1998-11-09");
            manager.searchByBirthday("1998-11-09");
            manager.clearTable();
        } finally {
            manager.exit();
        }
    }
}
