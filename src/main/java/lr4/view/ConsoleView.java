package lr4.view;

import lr4.models.human.Sex;
import lr4.models.university.University;

class ConsoleView implements Console {

    @Override
    public void createTypicalUniversity() {
        UniversityBuilder universityBuilder = new UniversityBuilder();

        universityBuilder
                .createUniversity("НТУ")
                .setUniversityHead("Викторов", "Виктор", "Викторович", Sex.MALE)
                .createFaculty("Системный анализ")
                .setFacultyHead("Янукович", "Олег", "Андреевич", Sex.MALE)
                .createDepartment("Системный анализ")
                .setDepartmentHead("Путин", "Антон", "Ростиславович", Sex.MALE)
                .createGroup("124-18ск-1")
                .setGroupHead("Клопотенко", "Евгений", "Сергеевич", Sex.MALE)
                .createStudent("Белоусов", "Луффи", "Валерьевич", Sex.MALE)
                .createStudent("Запашный", "Валентин", "Валентинович", Sex.MALE)
                .createStudent("Гаспарян", "Асмик", "Робертовна", Sex.FEMALE);

        showUniversity(universityBuilder.compose());
    }

    @Override
    public void showUniversity(University university) {
        System.out.println(university);
    }
}
