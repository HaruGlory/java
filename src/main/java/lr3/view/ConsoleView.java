package lr3.view;

import lr3.models.human.Sex;
import lr3.models.university.University;

class ConsoleView implements Console {

    @Override
    public void createTypicalUniversity() {
        UniversityBuilder universityBuilder = new UniversityBuilder();

        universityBuilder
                .createUniversity("НТУ")
                .setUniversityHead("Викторов", "Виктор", "Викторович", Sex.MALE)
                .createFaculty("Системного анализа")
                .setFacultyHead("Янукович", "Олег", "Андреевич", Sex.MALE)
                .createDepartment("Системного анализа")
                .setDepartmentHead("Путин", "Антон", "Ростиславович", Sex.MALE)
                .createGroup("124-18ск-1")
                .setGroupHead("Клопотенко", "Евгений", "Сергеевич", Sex.MALE)
                .createStudent("Белоусов", "Луффи", "Валерьевич", Sex.MALE)
                .createStudent("Запашный", "Валеннтин", "Валентинович", Sex.MALE)
                .createStudent("Гаспарян", "Асмик", "Робертовна", Sex.FEMALE);

        showUniversity(universityBuilder.compose());
    }

    @Override
    public void showUniversity(University university) {
        System.out.println(university);
    }
}