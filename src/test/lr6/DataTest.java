package lr6;

import org.junit.jupiter.api.Test;

public class DataTest {

    @Test
    public void insertCheck() {
        DataBaseManager manager = new DataBaseManager();
        try {
            manager.create("Daniil", "Mokhov", "Dmytrovych", "1999-11-01");
            manager.create("Alexander", "Prokopenko", "Alexandrovych", "1998-01-01");
            manager.create("Alex", "Nikitenko", "Olegovych", "1998-11-03");
            manager.create("Marina", "Prokopenko", "Alexandrovna", "1998-01-01");
            manager.searchByBirthday("1998-01-01");
            manager.clearTable();
        } finally {
            manager.exit();
        }
    }
}
