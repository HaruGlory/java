package lr3.controllers;

import lr3.models.faculty.Faculty;

public class FacultyCreator {
    public Faculty faculty;

    public FacultyCreator(String name) {
        this.faculty = new Faculty(name);
    }
}
