package lr4.controllers;

import lr4.models.department.Department;

public class DepartmentCreator {
    public Department department;

    public DepartmentCreator(String name) {
        this.department = new Department(name);
    }
}
