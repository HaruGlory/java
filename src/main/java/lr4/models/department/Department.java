package lr4.models.department;

import lr4.models.common.Organization;
import lr4.models.group.Group;

public class Department extends Organization<Group> {

    public Department(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", Департамент="+name+
                ", structure="+structure+
                "}";
    }
}
