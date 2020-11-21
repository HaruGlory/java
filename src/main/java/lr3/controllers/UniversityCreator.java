package lr3.controllers;

import lr3.models.university.University;

public class UniversityCreator {
    public University university;

    public UniversityCreator(String name) {
        this.university = new University(name);
    }
}
