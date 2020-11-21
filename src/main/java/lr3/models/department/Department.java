package lr3.models.department;

import lr3.models.common.Organization;
import lr3.models.group.Group;

public class Department extends Organization<Group> {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Department { " +
                "head = " + head +
                ", Департамент = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
