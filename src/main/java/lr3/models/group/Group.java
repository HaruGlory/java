package lr3.models.group;

import lr3.models.common.Organization;
import lr3.models.human.Student;

public class Group extends Organization<Student> {
    public Group(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "group { " +
                "head = " + head +
                ", группа = '" + name + '\'' +
                ", structure = " + structure +
                " } ";
    }
}
