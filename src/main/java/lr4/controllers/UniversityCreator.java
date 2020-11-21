package lr4.controllers;

import lr4.models.university.University;

public class UniversityCreator {
    public University university;

    public UniversityCreator(String name) {
        this.university = new University(name);
    }
}
