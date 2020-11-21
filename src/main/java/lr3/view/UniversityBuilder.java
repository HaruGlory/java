package lr3.view;

import lr3.controllers.*;
import lr3.models.human.Sex;
import lr3.models.university.University;

public class UniversityBuilder {
    private UniversityCreator universityCreator;
    private FacultyCreator facultyCreator;
    private DepartmentCreator departmentCreator;
    private GroupCreator groupCreator;

    public UniversityBuilder createUniversity(String university_name) {
        universityCreator = new UniversityCreator(university_name);
        return this;
    }

    public UniversityBuilder createFaculty(String group_name) {
        facultyCreator = new FacultyCreator(group_name);
        universityCreator.university.append(facultyCreator.faculty);
        return this;
    }

    public UniversityBuilder createDepartment(String department_name) {
        departmentCreator = new DepartmentCreator(department_name);
        facultyCreator.faculty.append(departmentCreator.department);
        return this;
    }

    public UniversityBuilder createGroup(String group_name) {
        groupCreator = new GroupCreator(group_name);
        departmentCreator.department.append(groupCreator.group);
        return this;
    }

    public UniversityBuilder createStudent(String first_name, String last_name, String patronymic, Sex sex) {
        StudentCreator studentCreator = new StudentCreator(first_name, last_name, patronymic, sex);
        groupCreator.group.append(studentCreator.student);
        return this;
    }

    public UniversityBuilder setUniversityHead(String first_name, String last_name, String patronymic, Sex sex) {
        universityCreator.university.setHead(first_name, last_name, patronymic, sex);
        return this;
    }

    public UniversityBuilder setFacultyHead(String first_name, String last_name, String patronymic, Sex sex) {
        facultyCreator.faculty.setHead(first_name, last_name, patronymic, sex);
        return this;
    }

    public UniversityBuilder setDepartmentHead(String first_name, String last_name, String patronymic, Sex sex) {
        departmentCreator.department.setHead(first_name, last_name, patronymic, sex);
        return this;
    }

    public UniversityBuilder setGroupHead(String first_name, String last_name, String patronymic, Sex sex) {
        groupCreator.group.setHead(first_name, last_name, patronymic, sex);
        return this;
    }

    public University compose() {
        return universityCreator.university;
    }
}
