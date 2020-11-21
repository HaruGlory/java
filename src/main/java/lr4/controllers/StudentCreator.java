package lr4.controllers;

import lr4.models.human.Sex;
import lr4.models.human.Student;

public class StudentCreator {
    public Student student;

    public StudentCreator(String first_name, String last_name, String patronymic, Sex sex) {
        this.student = new Student(first_name, last_name, patronymic, sex);
    }
}
