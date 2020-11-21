package lr4.controllers;

import lr4.models.faculty.Faculty;

public class FacultyCreator {
    public Faculty faculty;

    public FacultyCreator(String name) {
        this.faculty = new Faculty(name);
    }
}
