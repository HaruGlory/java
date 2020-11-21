package lr3.models.faculty;

import lr3.models.common.Organization;
import lr3.models.department.Department;

public class Faculty extends Organization<Department> {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Факультет { " +
                "head = " + head +
                ", Факультет = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
