import lr4.io.manager.manager.JsonManager;
import lr4.models.human.Sex;
import lr4.models.university.University;
import lr4.view.UniversityBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class ConsoleTests {
    private static JsonManager jsonManager;
    private static String defaultPath;

    @BeforeAll
    static void init() {
        jsonManager = JsonManager.getInstance();
        defaultPath = "./src/test/university.json";
    }

    @AfterAll
    static void cleanUp() {
        jsonManager = null;
        defaultPath = null;
    }

    @Test
    public void checkUniversityEquals() throws IOException {
        UniversityBuilder universityBuilder = new UniversityBuilder();
        jsonManager.setSerializable(
                        universityBuilder
                            .createUniversity("NTU")
                            .setUniversityHead("Викторов", "Виктор", "Викторович", Sex.MALE)
                            .createFaculty("Системного анализа")
                            .setFacultyHead("Янукович", "Олег", "Андреевич", Sex.MALE)
                            .createDepartment("Системного анализа")
                            .setDepartmentHead("Путин", "Антон", "Ростиславович", Sex.MALE)
                            .createGroup("124-18ск-1")
                            .setGroupHead("Клопотенко", "Евгений", "Сергеевич", Sex.MALE)
                            .createStudent("Белоусов", "Луффи", "Валерьевич", Sex.MALE)
                            .createStudent("Запашный", "Валентин", "Валентинович", Sex.MALE)
                            .createStudent("Гаспарян", "Асмик", "Робертовна", Sex.FEMALE).compose());

        jsonManager.convertToJson(defaultPath);

        Assertions.assertEquals(jsonManager.getFromJson(defaultPath, University.class), universityBuilder.compose());
    }
}
