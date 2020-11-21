package lr4.models.university;

import lr4.models.common.Organization;
import lr4.models.faculty.Faculty;

public class University extends Organization<Faculty> {

    public University(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "{head="+head+
                ", Университет="+name+
                ", structure="+structure+
                "}";
    }

}
