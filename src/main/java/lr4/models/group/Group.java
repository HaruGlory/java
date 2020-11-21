package lr4.models.group;

import lr4.models.common.Organization;
import lr4.models.human.Student;

public class Group extends Organization<Student> {
    public Group(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", группа="+name+
                ", structure="+structure+
                "}";
    }
}
