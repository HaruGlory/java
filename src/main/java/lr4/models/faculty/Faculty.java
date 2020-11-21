package lr4.models.faculty;

import lr4.models.department.Department;
import lr4.models.common.Organization;

public class Faculty extends Organization<Department> {

    public Faculty(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", Факультет="+name+
                ", structure="+structure+
                "}";
    }
}
