package lr3.controllers;

import lr3.models.department.Department;

public class DepartmentCreator {
    public Department department;

    public DepartmentCreator(String name) {
        this.department = new Department(name);
    }
}
