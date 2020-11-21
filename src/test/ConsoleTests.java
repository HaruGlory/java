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
                            .setUniversityHead("Linus", "Benedict", "Torvalds", Sex.MALE)
                            .createFaculty("System analysis and management")
                            .setFacultyHead("Dennis", "MacAlistair", "Ritchie", Sex.MALE)
                            .createDepartment("System analysis and management")
                            .setDepartmentHead("Kenneth", "Lane", "Thompson", Sex.MALE)
                            .createGroup("124-18sk-1")
                            .setGroupHead("Bjarne", "Stroustrup", "Stroustrupovich", Sex.MALE)
                            .createStudent("Auff", "Auffovich", "Auffov", Sex.MALE)
                            .createStudent("Jekos", "Jekosovich", "Jekson", Sex.MALE)
                            .createStudent("Nastyxa", "Naste4ka", "Anastasia", Sex.FEMALE).compose());

        jsonManager.convertToJson(defaultPath);

        Assertions.assertEquals(jsonManager.getFromJson(defaultPath, University.class), universityBuilder.compose());
    }
}
